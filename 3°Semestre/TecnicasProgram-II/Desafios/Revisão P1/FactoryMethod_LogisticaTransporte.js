class Transporte {
    entregar() {
      throw new Error("Método 'entregar()' deve ser implementado.");
    }
  }
  
  class Caminhao extends Transporte {
    entregar() {
      return "Entrega feita por caminhão.";
    }
  }
  
  class Navio extends Transporte {
    entregar() {
      return "Entrega feita por navio.";
    }
  }
  
  class Drone extends Transporte {
    entregar() {
      return "Entrega feita por drone.";
    }
  }
  
  // Classe Logistica com o Factory Method
  class Logistica {
    criarTransporte() {
      throw new Error("Método 'criarTransporte()' deve ser implementado.");
    }
  
    processarEntrega() {
      const transporte = this.criarTransporte();
      return transporte.entregar();
    }
  }
  
  // Fábricas específicas
  class LogisticaRodoviaria extends Logistica {
    criarTransporte() {
      return new Caminhao();
    }
  }
  
  class LogisticaMaritima extends Logistica {
    criarTransporte() {
      return new Navio();
    }
  }
  
  class LogisticaAerea extends Logistica {
    criarTransporte() {
      return new Drone();
    }
  }
  
  // Exemplo de uso:
  const rodoviaria = new LogisticaRodoviaria();
  console.log(rodoviaria.processarEntrega()); 
  
  const maritima = new LogisticaMaritima();
  console.log(maritima.processarEntrega()); 
  
  const aerea = new LogisticaAerea();
  console.log(aerea.processarEntrega()); 