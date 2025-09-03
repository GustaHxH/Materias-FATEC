class Relatorio {
    constructor() {
      this.partes = [];
    }
  
    mostrar() {
      return this.partes.join('\n');
    }
  }
  
  class RelatorioBuilder {
    constructor() {
      this.relatorio = new Relatorio();
    }
  
    adicionarCapa(titulo) {
      this.relatorio.partes.push(`Capa: ${titulo}`);
      return this;
    }
  
    adicionarSumario(itens) {
      this.relatorio.partes.push(`Sumário: ${itens.join(', ')}`);
      return this;
    }
  
    adicionarConteudo(texto) {
      this.relatorio.partes.push(`Conteúdo: ${texto}`);
      return this;
    }
  
    adicionarGraficos(tipos) {
      this.relatorio.partes.push(`Gráficos: ${tipos.join(', ')}`);
      return this;
    }
  
    build() {
      return this.relatorio;
    }
  }
  
  class Diretor {
    construirRelatorioCompleto(builder) {
      builder
        .adicionarCapa("Relatório Anual")
        .adicionarSumario(["Introdução", "Análise", "Conclusão"])
        .adicionarConteudo("Este relatório mostra os resultados do ano.")
        .adicionarGraficos(["Pizza", "Barra"]);
      return builder.build();
    }
  }
  
  const builder = new RelatorioBuilder();
  const diretor = new Diretor();
  const relatorio = diretor.construirRelatorioCompleto(builder);
  
  console.log(relatorio.mostrar());