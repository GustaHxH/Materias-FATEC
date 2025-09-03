class Arma {
    usar() {
      throw new Error("Método 'usar()' deve ser implementado.");
    }
  }
  
  class Habilidade {
    ativar() {
      throw new Error("Método 'ativar()' deve ser implementado.");
    }
  }
  
  class Espada extends Arma {
    usar() {
      return "Usando espada sagrada.";
    }
  }
  
  class Cura extends Habilidade {
    ativar() {
      return "Habilidade de cura ativada.";
    }
  }
  
  class Machado extends Arma {
    usar() {
      return "Usando machado sombrio.";
    }
  }
  
  class MagiaSombria extends Habilidade {
    ativar() {
      return "Magia sombria lançada.";
    }
  }
  
  class FabricaPersonagem {
    criarArma() {
      throw new Error("Método 'criarArma()' deve ser implementado.");
    }
  
    criarHabilidade() {
      throw new Error("Método 'criarHabilidade()' deve ser implementado.");
    }
  }
  
  class FabricaHeroi extends FabricaPersonagem {
    criarArma() {
      return new Espada();
    }
  
    criarHabilidade() {
      return new Cura();
    }
  }
  
  class FabricaVilao extends FabricaPersonagem {
    criarArma() {
      return new Machado();
    }
  
    criarHabilidade() {
      return new MagiaSombria();
    }
  }
  
  function jogar(fabrica) {
    const arma = fabrica.criarArma();
    const habilidade = fabrica.criarHabilidade();
    console.log(arma.usar());
    console.log(habilidade.ativar());
  }
  
  const heroi = new FabricaHeroi();
  jogar(heroi);
  
  const vilao = new FabricaVilao();
  jogar(vilao);  