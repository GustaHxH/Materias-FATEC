class GradeHoraria {
    constructor() {
      this.itens = [];
    }
  
    mostrar() {
      return this.itens.map(i => `${i.dia} - ${i.disciplina} às ${i.horario} na sala ${i.sala}`).join('\n');
    }
  }
  
  class GradeBuilder {
    constructor() {
      this.grade = new GradeHoraria();
    }
  
    adicionarDisciplina(dia, disciplina, horario, sala) {
      this.grade.itens.push({ dia, disciplina, horario, sala });
      return this;
    }
  
    build() {
      return this.grade;
    }
  }
  
  const grade = new GradeBuilder()
    .adicionarDisciplina("Segunda", "Matemática", "08:00", "101")
    .adicionarDisciplina("Terça", "História", "10:00", "202")
    .adicionarDisciplina("Quinta", "Física", "14:00", "303")
    .build();
  
  console.log(grade.mostrar());  