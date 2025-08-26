class Documento {
    constructor(titulo, conteudo) {
      this.titulo = titulo;
      this.conteudo = conteudo;
    }
  
    clone() {
      return new Documento(this.titulo, this.conteudo);
    }
  
    mostrar() {
      return `Título: ${this.titulo}\nConteúdo: ${this.conteudo}`;
    }
  }
  
  class Contrato extends Documento {
    constructor(conteudo) {
      super("Contrato", conteudo);
    }
  
    clone() {
      return new Contrato(this.conteudo);
    }
  }
  
  class Carta extends Documento {
    constructor(conteudo) {
      super("Carta", conteudo);
    }
  
    clone() {
      return new Carta(this.conteudo);
    }
  }
  
  class Relatorio extends Documento {
    constructor(conteudo) {
      super("Relatório", conteudo);
    }
  
    clone() {
      return new Relatorio(this.conteudo);
    }
  }
  
  const contratoBase = new Contrato("Contrato padrão de prestação de serviços.");
  const contratoCliente = contratoBase.clone();
  
  const cartaBase = new Carta("Prezado cliente, segue anexo...");
  const cartaEnvio = cartaBase.clone();
  
  const relatorioBase = new Relatorio("Relatório financeiro do mês.");
  const relatorioFinal = relatorioBase.clone();
  
  console.log(contratoCliente.mostrar());
  console.log();
  console.log(cartaEnvio.mostrar());
  console.log();
  console.log(relatorioFinal.mostrar());
  