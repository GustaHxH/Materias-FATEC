class Estudante {
    constructor() {
      this.nome = "";
      this.curso = "";
      this.endereco = "";
      this.email = "";
      this.celular = "";
      this.responsaveis = [];
    }
  
    mostrar() {
      return `
  Nome: ${this.nome}
  Curso: ${this.curso}
  Endereço: ${this.endereco}
  Email: ${this.email}
  Celular: ${this.celular}
  Responsáveis: ${this.responsaveis.join(', ')}
      `.trim();
    }
  }
  
  class EstudanteBuilder {
    constructor() {
      this.estudante = new Estudante();
    }
  
    setNome(nome) {
      this.estudante.nome = nome;
      return this;
    }
  
    setCurso(curso) {
      this.estudante.curso = curso;
      return this;
    }
  
    setEndereco(endereco) {
      this.estudante.endereco = endereco;
      return this;
    }
  
    setEmail(email) {
      this.estudante.email = email;
      return this;
    }
  
    setCelular(celular) {
      this.estudante.celular = celular;
      return this;
    }
  
    adicionarResponsavel(nomeResponsavel) {
      this.estudante.responsaveis.push(nomeResponsavel);
      return this;
    }
  
    build() {
      return this.estudante;
    }
  }
  
  const estudante = new EstudanteBuilder()
    .setNome("João da Silva")
    .setCurso("Engenharia")
    .setEmail("joao@email.com")
    .adicionarResponsavel("Maria Silva")
    .build();
  
  console.log(estudante.mostrar());
  