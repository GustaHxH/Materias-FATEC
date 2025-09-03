class Menu {
    exibir() {
      throw new Error("Método 'exibir()' deve ser implementado.");
    }
  }
  
  class Idioma {
    traduzir() {
      throw new Error("Método 'traduzir()' deve ser implementado.");
    }
  }
  
  class Layout {
    configurar() {
      throw new Error("Método 'configurar()' deve ser implementado.");
    }
  }
  
  class MenuBrasil extends Menu {
    exibir() {
      return "Menu em português do Brasil";
    }
  }
  
  class IdiomaBrasil extends Idioma {
    traduzir() {
      return "Idioma definido como Português-BR";
    }
  }
  
  class LayoutBrasil extends Layout {
    configurar() {
      return "Layout com padrão brasileiro";
    }
  }
  
  class MenuEUA extends Menu {
    exibir() {
      return "Menu in English (USA)";
    }
  }
  
  class IdiomaEUA extends Idioma {
    traduzir() {
      return "Language set to English-US";
    }
  }
  
  class LayoutEUA extends Layout {
    configurar() {
      return "Layout with American standard";
    }
  }
  
  class BancoFactory {
    criarMenu() {
      throw new Error("Método 'criarMenu()' deve ser implementado.");
    }
  
    criarIdioma() {
      throw new Error("Método 'criarIdioma()' deve ser implementado.");
    }
  
    criarLayout() {
      throw new Error("Método 'criarLayout()' deve ser implementado.");
    }
  }
  
  class BancoBrasilFactory extends BancoFactory {
    criarMenu() {
      return new MenuBrasil();
    }
  
    criarIdioma() {
      return new IdiomaBrasil();
    }
  
    criarLayout() {
      return new LayoutBrasil();
    }
  }
  
  class BancoEUAFactory extends BancoFactory {
    criarMenu() {
      return new MenuEUA();
    }
  
    criarIdioma() {
      return new IdiomaEUA();
    }
  
    criarLayout() {
      return new LayoutEUA();
    }
  }
  
  function iniciarInterface(factory) {
    const menu = factory.criarMenu();
    const idioma = factory.criarIdioma();
    const layout = factory.criarLayout();
  
    console.log(menu.exibir());
    console.log(idioma.traduzir());
    console.log(layout.configurar());
  }
  
  const sistemaBrasil = new BancoBrasilFactory();
  iniciarInterface(sistemaBrasil);
  
  const sistemaEUA = new BancoEUAFactory();
  iniciarInterface(sistemaEUA);