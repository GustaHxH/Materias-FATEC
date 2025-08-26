class Pizza {
    constructor() {
      this.ingredientes = [];
    }
  
    mostrar() {
      return `Pizza com: ${this.ingredientes.join(', ')}`;
    }
  }
  
  class PizzaBuilder {
    constructor() {
      this.pizza = new Pizza();
    }
  
    adicionarMassa(tipo) {
      this.pizza.ingredientes.push(`massa ${tipo}`);
      return this;
    }
  
    adicionarMolho(tipo) {
      this.pizza.ingredientes.push(`molho ${tipo}`);
      return this;
    }
  
    adicionarQueijo(tipo) {
      this.pizza.ingredientes.push(`queijo ${tipo}`);
      return this;
    }
  
    adicionarCobertura(cobertura) {
      this.pizza.ingredientes.push(cobertura);
      return this;
    }
  
    build() {
      return this.pizza;
    }
  }
  
  const pizzaCliente = new PizzaBuilder()
    .adicionarMassa("fina")
    .adicionarMolho("tomate")
    .adicionarQueijo("mussarela")
    .adicionarCobertura("pepperoni")
    .adicionarCobertura("azeitona")
    .build();
  
  console.log(pizzaCliente.mostrar());
  