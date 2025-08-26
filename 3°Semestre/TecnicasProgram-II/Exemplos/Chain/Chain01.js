//Classe abstrata
class DescontoHolder{
    constructor(){
        this.proximo = null;
    }
    setProximo(proximo){
        this.proximo = proximo;
    }

    aprovarDesconto(percentual){
        throw new Error("Esse metodo deve ser implementado pelas subclasses")
    }
}

//Classe concreta
class GerenteVendas extends DescontoHolder{
    aprovarDesconto(percentual){
        if (percentual <= 0.05){
            console.log(`Gerente de vendas aprovou o desconto de ${percentual * 100}%`)
        }else if (this.proximo){
            this.proximo.aprovarDesconto(percentual);
        }else{
            console.log("Desconto não pode ser aprovado")
        }
    }
}

class DiretorVendas extends DescontoHolder{
    aprovarDesconto(percentual){
        if (percentual <= 0.15){
            console.log(`Diretor de vendas aprovou o desconto de ${percentual * 100}%`)
        }else if (this.proximo){
            this.proximo.aprovarDesconto(percentual);
        }else{
            console.log("Desconto não pode ser aprovado")
        }
    }
}

class CEO extends DescontoHolder{
    aprovarDesconto(percentual){
        if (percentual <= 0.25){
            console.log(`CEO de vendas aprovou o desconto de ${percentual * 100}%`)
        }else{
            console.log("Desconto não pode ser aprovado")
        }
    }
}

//Utilização - chamado pelo cliente:

//Configuração da cadeia de Responsabilidade

const gerente = new GerenteVendas();
const diretor = new DiretorVendas();
const ceo = new CEO();

gerente.setProximo(diretor);
diretor.setProximo(ceo);

//Pedido de desconto 

gerente.aprovarDesconto(0.02);
gerente.aprovarDesconto(0.10);
gerente.aprovarDesconto(0.20);
gerente.aprovarDesconto(0.50);