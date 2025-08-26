class Servico {
    agendar() {
      throw new Error("Método 'agendar()' deve ser implementado.");
    }
  }
  
  class Consulta extends Servico {
    agendar() {
      return "Consulta agendada.";
    }
  }
  
  class Reparo extends Servico {
    agendar() {
      return "Reparo agendado.";
    }
  }
  
  class Entrega extends Servico {
    agendar() {
      return "Entrega agendada.";
    }
  }
  
  class CriadorServico {
    criarServico() {
      throw new Error("Método 'criarServico()' deve ser implementado.");
    }
  
    agendarServico() {
      const servico = this.criarServico();
      return servico.agendar();
    }
  }
  
  class CriadorConsulta extends CriadorServico {
    criarServico() {
      return new Consulta();
    }
  }
  
  class CriadorReparo extends CriadorServico {
    criarServico() {
      return new Reparo();
    }
  }
  
  class CriadorEntrega extends CriadorServico {
    criarServico() {
      return new Entrega();
    }
  }
  
  const consulta = new CriadorConsulta();
  console.log(consulta.agendarServico());
  
  const reparo = new CriadorReparo();
  console.log(reparo.agendarServico());
  
  const entrega = new CriadorEntrega();
  console.log(entrega.agendarServico());