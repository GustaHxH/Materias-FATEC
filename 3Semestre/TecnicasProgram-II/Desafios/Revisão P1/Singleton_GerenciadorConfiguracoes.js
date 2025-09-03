class GerenciadorConfiguracoes {
    constructor() {
      if (GerenciadorConfiguracoes.instancia) {
        return GerenciadorConfiguracoes.instancia;
      }
      this.configuracoes = {};
      GerenciadorConfiguracoes.instancia = this;
    }
  
    static getInstance() {
      if (!GerenciadorConfiguracoes.instancia) {
        GerenciadorConfiguracoes.instancia = new GerenciadorConfiguracoes();
      }
      return GerenciadorConfiguracoes.instancia;
    }
  
    setConfig(chave, valor) {
      this.configuracoes[chave] = valor;
    }
  
    getConfig(chave) {
      return this.configuracoes[chave];
    }
  }
  
  const config1 = GerenciadorConfiguracoes.getInstance();
  config1.setConfig("modo", "escuro");
  
  const config2 = GerenciadorConfiguracoes.getInstance();
  console.log(config2.getConfig("modo")); // "escuro"
  