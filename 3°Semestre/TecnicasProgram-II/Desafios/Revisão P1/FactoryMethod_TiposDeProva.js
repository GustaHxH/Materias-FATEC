class Prova {
    aplicar() {
      throw new Error("Método 'aplicar()' deve ser implementado.");
    }
  }
  
  // Tipos concretos de prova
  class ProvaObjetiva extends Prova {
    aplicar() {
      return "Prova objetiva aplicada.";
    }
  }
  
  class ProvaDissertativa extends Prova {
    aplicar() {
      return "Prova dissertativa aplicada.";
    }
  }
  
  class ProvaPratica extends Prova {
    aplicar() {
      return "Prova prática aplicada.";
    }
  }
  
  // Criador com Factory Method
  class CriadorProva {
    criarProva(tipo) {
      if (tipo === "objetiva") {
        return new ProvaObjetiva();
      } else if (tipo === "dissertativa") {
        return new ProvaDissertativa();
      } else if (tipo === "pratica") {
        return new ProvaPratica();
      } else {
        throw new Error("Tipo de prova desconhecido.");
      }
    }
  }
  
  // Exemplo de uso:
  const criador = new CriadorProva();
  
  const prova1 = criador.criarProva("objetiva");
  console.log(prova1.aplicar());
  
  const prova2 = criador.criarProva("dissertativa");
  console.log(prova2.aplicar());
  
  const prova3 = criador.criarProva("pratica");
  console.log(prova3.aplicar());