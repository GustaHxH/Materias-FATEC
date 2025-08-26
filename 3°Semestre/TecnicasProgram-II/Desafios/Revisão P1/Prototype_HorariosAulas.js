class Horario {
    constructor(dia, horaInicio, horaFim, disciplina) {
      this.dia = dia;
      this.horaInicio = horaInicio;
      this.horaFim = horaFim;
      this.disciplina = disciplina;
    }
  
    clone() {
      return new Horario(this.dia, this.horaInicio, this.horaFim, this.disciplina);
    }
  
    mostrar() {
      return `Dia: ${this.dia}\nHorário: ${this.horaInicio} - ${this.horaFim}\nDisciplina: ${this.disciplina}`;
    }
  }
  
  const modeloHorario = new Horario("Segunda-feira", "08:00", "10:00", "Matemática");
  
  const horarioAluno1 = modeloHorario.clone();
  horarioAluno1.disciplina = "Física";
  
  const horarioAluno2 = modeloHorario.clone();
  horarioAluno2.horaInicio = "10:00";
  horarioAluno2.horaFim = "12:00";
  horarioAluno2.disciplina = "Química";
  
  console.log(modeloHorario.mostrar());
  console.log();
  console.log(horarioAluno1.mostrar());
  console.log();
  console.log(horarioAluno2.mostrar());
  