class CarrinhoCompras {
    constructor() {
      if (CarrinhoCompras.instancia) {
        return CarrinhoCompras.instancia;
      }
      this.itens = [];
      CarrinhoCompras.instancia = this;
    }
  
    static getInstance() {
      if (!CarrinhoCompras.instancia) {
        CarrinhoCompras.instancia = new CarrinhoCompras();
      }
      return CarrinhoCompras.instancia;
    }
  
    adicionarItem(item) {
      this.itens.push(item);
    }
  
    listarItens() {
      return this.itens;
    }
  
    total() {
      return this.itens.reduce((soma, item) => soma + item.preco, 0);
    }
  }
  
  const carrinho1 = CarrinhoCompras.getInstance();
  carrinho1.adicionarItem({ nome: "Camisa", preco: 50 });
  
  const carrinho2 = CarrinhoCompras.getInstance();
  carrinho2.adicionarItem({ nome: "Tênis", preco: 150 });
  
  console.log(carrinho2.listarItens());
  console.log("Total: R$ " + carrinho2.total());
  