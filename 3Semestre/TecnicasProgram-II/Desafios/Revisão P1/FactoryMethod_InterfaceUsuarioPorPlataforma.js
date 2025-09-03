class Botao {
    renderizar() {
      throw new Error("Método 'renderizar()' deve ser implementado.");
    }
  }
  
  class BotaoWindows extends Botao {
    renderizar() {
      return "Botão estilo Windows criado.";
    }
  }
  
  class BotaoMac extends Botao {
    renderizar() {
      return "Botão estilo Mac criado.";
    }
  }
  
  class BotaoLinux extends Botao {
    renderizar() {
      return "Botão estilo Linux criado.";
    }
  }
  
  class InterfaceFactory {
    criarBotao() {
      throw new Error("Método 'criarBotao()' deve ser implementado.");
    }
  }
  
  class InterfaceWindows extends InterfaceFactory {
    criarBotao() {
      return new BotaoWindows();
    }
  }
  
  class InterfaceMac extends InterfaceFactory {
    criarBotao() {
      return new BotaoMac();
    }
  }
  
  class InterfaceLinux extends InterfaceFactory {
    criarBotao() {
      return new BotaoLinux();
    }
  }
  
  const windows = new InterfaceWindows();
  console.log(windows.criarBotao().renderizar());
  
  const mac = new InterfaceMac();
  console.log(mac.criarBotao().renderizar());
  
  const linux = new InterfaceLinux();
  console.log(linux.criarBotao().renderizar());