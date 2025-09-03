class Produto {
    exibir() {
      throw new Error("Método 'exibir()' deve ser implementado.");
    }
  }
  
  class Categoria {
    listar() {
      throw new Error("Método 'listar()' deve ser implementado.");
    }
  }
  
  class Televisao extends Produto {
    exibir() {
      return "Produto: Televisão 4K";
    }
  }
  
  class Eletronicos extends Categoria {
    listar() {
      return "Categoria: Eletrônicos";
    }
  }
  
  class Camiseta extends Produto {
    exibir() {
      return "Produto: Camiseta Estilosa";
    }
  }
  
  class Moda extends Categoria {
    listar() {
      return "Categoria: Moda";
    }
  }
  
  class FabricaEcommerce {
    criarProduto() {
      throw new Error("Método 'criarProduto()' deve ser implementado.");
    }
  
    criarCategoria() {
      throw new Error("Método 'criarCategoria()' deve ser implementado.");
    }
  }
  
  class FabricaEletronicos extends FabricaEcommerce {
    criarProduto() {
      return new Televisao();
    }
  
    criarCategoria() {
      return new Eletronicos();
    }
  }
  
  class FabricaModa extends FabricaEcommerce {
    criarProduto() {
      return new Camiseta();
    }
  
    criarCategoria() {
      return new Moda();
    }
  }
  
  function montarPagina(fabrica) {
    const produto = fabrica.criarProduto();
    const categoria = fabrica.criarCategoria();
    console.log(produto.exibir());
    console.log(categoria.listar());
  }
  
  const eletronicos = new FabricaEletronicos();
  montarPagina(eletronicos);
  
  const moda = new FabricaModa();
  montarPagina(moda); 