class Pizza {
    constructor(sabor, ingredientes, preco) {
      this.sabor = sabor;
      this.ingredientes = ingredientes;
      this.preco = preco;
      this.tamanho = 'Tradicional (30 cm)';
      this.borda = 'Tradicional';
      this.molho = 'Tomate';
    }
  
    clonar() {
      console.log('Clonando a pizza...');  // Adicionando log para verificar o processo
      const pizzaClonada = new this.constructor(this.sabor, [...this.ingredientes], this.preco);
      pizzaClonada.tamanho = this.tamanho;
      pizzaClonada.borda = this.borda;
      pizzaClonada.molho = this.molho;
      return pizzaClonada;
    }
  
    removerIngrediente(ingrediente) {
      console.log(`Removendo ingrediente: ${ingrediente}`); // Log para verificar remoção de ingrediente
      this.ingredientes = this.ingredientes.filter(item => item !== ingrediente);
    }
  
    calcularPreco() {
      console.log(`Calculando preço da pizza ${this.sabor}`);  // Log para ver se o cálculo de preço é chamado
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
    1: new Pizza('Mussarela', ['Mussarela', 'Presunto', 'Tomate', 'Orégano'], 29.90),
    2: new Pizza('Marguerita', ['Mussarela', 'Tomate', 'Manjericão', 'Azeite'], 31.49),
    3: new Pizza('Calabresa', ['Calabresa', 'Cebola', 'Azeitonas', 'Orégano'], 32.49),
    4: new Pizza('Frango com Catupiry', ['Frango', 'Catupiry', 'Milho', 'Azeitonas'], 36.70),
    5: new Pizza('Quatro Queijos', ['Mussarela', 'Provolone', 'Gorgonzola', 'Parmesão'], 40.00),
  };
  
  // Função para pedir opções ao cliente (utilizando readline)
  const readline = require('readline');
  const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });
  
  function pedirOpcao(mensagem) {
  // Log para garantir que a pergunta foi feita
    return new Promise(resolve => rl.question(mensagem, resolve));
  }
  
  async function fazerPedido() {
    console.log('Iniciando pedido...');
    const saborEscolhido = await pedirOpcao('Escolha o sabor da pizza (1-5) sendo:\n 1 - Mussarela \n 2 - Marguerita \n 3 - Calabresa \n 4 - Frango com catupiry \n 5 - Quatro queijos \n Sua escolha: ');
    let pizza = sabores[saborEscolhido].clonar();
  
    pizza.tamanho = await pedirOpcao('Escolha o tamanho (Brotinho, Tradicional, Grande): ') || 'Tradicional (30 cm)';
    pizza.borda = await pedirOpcao('Escolha a borda (Tradicional, Sem Borda, Recheada com Queijo): ') || 'Tradicional';
    pizza.molho = await pedirOpcao('Escolha o molho (Tomate, Temperado1, Temperado2): ') || 'Tomate';
  
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