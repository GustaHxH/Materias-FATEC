class Pizza {
    static instancia = null;

    constructor() {
        if (Pizza.instancia) {
            return Pizza.instancia;
        }
        
        this.sabor = "";
        this.ingredientes = [];
        this.preco = 0;
        this.tamanho = "";
        this.borda = "";
        this.molho = "";

        Pizza.instancia = this;
    }

    static getInstance() {
        if (!Pizza.instancia) {
            Pizza.instancia = new Pizza();
        }
        return Pizza.instancia;
    }

    defSabor(sabor) {
        this.sabor = sabor;
    }

    defIngredientes(ingredientes) {
        this.ingredientes = ingredientes;
    }

    addPreco(preco) {
        this.preco = preco;
    }

    defTamanho(tamanho) {
        this.tamanho = tamanho;
    }

    defBorda(borda) {
        this.borda = borda;
    }

    defMolho(molho) {
        this.molho = molho;
    }

    removerIngrediente(ingrediente) {
        console.log(`Removendo ingrediente: ${ingrediente}`);
        this.ingredientes = this.ingredientes.filter(item => item.toLowerCase() !== ingrediente.toLowerCase());
    }

    calcularPreco() {
        return this.preco;
    }

    exibirDetalhes() {
        console.log('\n--- Detalhes da Pizza ---');
        console.log(`Sabor: ${this.sabor}`);
        console.log(`Ingredientes: ${this.ingredientes.join(', ')}`);
        console.log(`Tamanho: ${this.tamanho}`);
        console.log(`Borda: ${this.borda}`);
        console.log(`Molho: ${this.molho}`);
        console.log(`Preço: R$ ${this.calcularPreco().toFixed(2)}`);
    }
}

const sabores = {
    1: { sabor: 'Mussarela', ingredientes: ['Mussarela', 'Presunto', 'Tomate', 'Orégano'], preco: 29.90 },
    2: { sabor: 'Marguerita', ingredientes: ['Mussarela', 'Tomate', 'Manjericão', 'Azeite'], preco: 31.49 },
    3: { sabor: 'Calabresa', ingredientes: ['Calabresa', 'Cebola', 'Azeitonas', 'Orégano'], preco: 32.49 },
    4: { sabor: 'Frango com Catupiry', ingredientes: ['Frango', 'Catupiry', 'Milho', 'Azeitonas'], preco: 36.70 },
    5: { sabor: 'Quatro Queijos', ingredientes: ['Mussarela', 'Provolone', 'Gorgonzola', 'Parmesão'], preco: 40.00 },
};

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function pedirOpcao(mensagem) {
    return new Promise(resolve => rl.question(mensagem, resolve));
}

async function fazerPedido() {
    console.log('Iniciando pedido...');

    const saborEscolhido = parseInt(await pedirOpcao('Escolha o sabor da pizza (1-5):\n 1 - Mussarela\n 2 - Marguerita\n 3 - Calabresa\n 4 - Frango com Catupiry\n 5 - Quatro Queijos\nSua escolha: '));

    if (!sabores[saborEscolhido]) {
        console.log('Opção inválida. Encerrando...');
        rl.close();
        return;
    }


    const pizza = Pizza.getInstance(); // Obtendo a instância única da pizza
    pizza.defSabor(sabores[saborEscolhido].sabor);
    pizza.defIngredientes([...sabores[saborEscolhido].ingredientes]);
    pizza.addPreco(sabores[saborEscolhido].preco);

    pizza.defTamanho(await pedirOpcao('Escolha o tamanho (Brotinho, Tradicional, Grande): ') || 'Tradicional');
    pizza.defBorda(await pedirOpcao('Escolha a borda (Tradicional, Sem Borda, Recheada com Queijo): ') || 'Tradicional');
    pizza.defMolho(await pedirOpcao('Escolha o molho (Tomate, Temperado1, Temperado2): ') || 'Tomate');

    let continuar = (await pedirOpcao('Deseja remover algum ingrediente? (Sim/Não): ')).toLowerCase() === 'sim';
    while (continuar) {
        const ingrediente = await pedirOpcao('Ingrediente a remover (ou 0 para finalizar): ');
        if (ingrediente === '0') continuar = false;
        else pizza.removerIngrediente(ingrediente);
    }

    console.log('\n--- Pedido Finalizado ---');
    pizza.exibirDetalhes();
    rl.close();
}

fazerPedido();