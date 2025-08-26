class Motor {
    ligar() {
      throw new Error("Método 'ligar()' deve ser implementado.");
    }
  }
  
  class Roda {
    girar() {
      throw new Error("Método 'girar()' deve ser implementado.");
    }
  }
  
  class Freio {
    acionar() {
      throw new Error("Método 'acionar()' deve ser implementado.");
    }
  }
  
  class MotorEsportivo extends Motor {
    ligar() {
      return "Motor esportivo ligado";
    }
  }
  
  class RodaEsportiva extends Roda {
    girar() {
      return "Rodas esportivas girando rápido";
    }
  }
  
  class FreioEsportivo extends Freio {
    acionar() {
      return "Freio esportivo acionado";
    }
  }
  
  class MotorPopular extends Motor {
    ligar() {
      return "Motor popular ligado";
    }
  }
  
  class RodaPopular extends Roda {
    girar() {
      return "Rodas populares girando";
    }
  }
  
  class FreioPopular extends Freio {
    acionar() {
      return "Freio popular acionado";
    }
  }
  
  class VeiculoFactory {
    criarMotor() {
      throw new Error("Método 'criarMotor()' deve ser implementado.");
    }
  
    criarRoda() {
      throw new Error("Método 'criarRoda()' deve ser implementado.");
    }
  
    criarFreio() {
      throw new Error("Método 'criarFreio()' deve ser implementado.");
    }
  }
  
  class EsportivoFactory extends VeiculoFactory {
    criarMotor() {
      return new MotorEsportivo();
    }
  
    criarRoda() {
      return new RodaEsportiva();
    }
  
    criarFreio() {
      return new FreioEsportivo();
    }
  }
  
  class PopularFactory extends VeiculoFactory {
    criarMotor() {
      return new MotorPopular();
    }
  
    criarRoda() {
      return new RodaPopular();
    }
  
    criarFreio() {
      return new FreioPopular();
    }
  }
  
  function simular(factory) {
    const motor = factory.criarMotor();
    const roda = factory.criarRoda();
    const freio = factory.criarFreio();
  
    console.log(motor.ligar());
    console.log(roda.girar());
    console.log(freio.acionar());
  }
  
  const esportivo = new EsportivoFactory();
  simular(esportivo);
  
  const popular = new PopularFactory();
  simular(popular);
  