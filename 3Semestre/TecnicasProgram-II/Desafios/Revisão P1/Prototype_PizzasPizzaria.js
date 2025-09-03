class Pizza {
    constructor(nome, ingredientes = []) {
      this.nome = nome;
      this.ingredientes = [...ingredientes];
    }
  
    clone() {
      return new Pizza(this.nome, this.ingredientes);
    }
  
    adicionarIngrediente(ingrediente) {
      this.ingredientes.push(ingrediente);
    }
  
    mostrar() {
      return `Pizza: ${this.nome}\nIngredientes: ${this.ingredientes.join(', ')}`;
    }
  }
  
  const pizzaMussarela = new Pizza("Mussarela", ["queijo", "molho", "orégano"]);
  const pizzaDoCliente = pizzaMussarela.clone();
  pizzaDoCliente.adicionarIngrediente("azeitona");
  
  console.log(pizzaMussarela.mostrar());
  console.log();
  console.log(pizzaDoCliente.mostrar());  