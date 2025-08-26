class Botao {
    desenhar() {
      throw new Error("Método 'desenhar()' deve ser implementado.");
    }
  }
  
  class Menu {
    abrir() {
      throw new Error("Método 'abrir()' deve ser implementado.");
    }
  }
  
  class Janela {
    exibir() {
      throw new Error("Método 'exibir()' deve ser implementado.");
    }
  }
  
  class BotaoWindows extends Botao {
    desenhar() {
      return "Botão estilo Windows";
    }
  }
  
  class MenuWindows extends Menu {
    abrir() {
      return "Menu estilo Windows";
    }
  }
  
  class JanelaWindows extends Janela {
    exibir() {
      return "Janela estilo Windows";
    }
  }
  
  class BotaoLinux extends Botao {
    desenhar() {
      return "Botão estilo Linux";
    }
  }
  
  class MenuLinux extends Menu {
    abrir() {
      return "Menu estilo Linux";
    }
  }
  
  class JanelaLinux extends Janela {
    exibir() {
      return "Janela estilo Linux";
    }
  }
  
  class UIFactory {
    criarBotao() {
      throw new Error("Método 'criarBotao()' deve ser implementado.");
    }
  
    criarMenu() {
      throw new Error("Método 'criarMenu()' deve ser implementado.");
    }
  
    criarJanela() {
      throw new Error("Método 'criarJanela()' deve ser implementado.");
    }
  }
  
  class WindowsFactory extends UIFactory {
    criarBotao() {
      return new BotaoWindows();
    }
  
    criarMenu() {
      return new MenuWindows();
    }
  
    criarJanela() {
      return new JanelaWindows();
    }
  }
  
  class LinuxFactory extends UIFactory {
    criarBotao() {
      return new BotaoLinux();
    }
  
    criarMenu() {
      return new MenuLinux();
    }
  
    criarJanela() {
      return new JanelaLinux();
    }
  }
  
  function montarInterface(factory) {
    const botao = factory.criarBotao();
    const menu = factory.criarMenu();
    const janela = factory.criarJanela();
  
    console.log(botao.desenhar());
    console.log(menu.abrir());
    console.log(janela.exibir());
  }
  
  const interfaceWindows = new WindowsFactory();
  montarInterface(interfaceWindows);
  
  const interfaceLinux = new LinuxFactory();
  montarInterface(interfaceLinux);
  