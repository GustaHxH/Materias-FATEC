class Cargo {
    constructor(titulo, salarioBase, requisitos = []) {
      this.titulo = titulo;
      this.salarioBase = salarioBase;
      this.requisitos = [...requisitos];
    }
  
    clone() {
      return new Cargo(this.titulo, this.salarioBase, this.requisitos);
    }
  
    adicionarRequisito(requisito) {
      this.requisitos.push(requisito);
    }
  
    mostrar() {
      return `Cargo: ${this.titulo}\nSalário: R$ ${this.salarioBase}\nRequisitos: ${this.requisitos.join(', ')}`;
    }
  }
  
  const cargoDesenvolvedor = new Cargo("Desenvolvedor", 5000, ["JavaScript", "Git"]);
  const cargoJunior = cargoDesenvolvedor.clone();
  cargoJunior.salarioBase = 3500;
  cargoJunior.adicionarRequisito("Inglês básico");
  
  const cargoSenior = cargoDesenvolvedor.clone();
  cargoSenior.salarioBase = 8000;
  cargoSenior.adicionarRequisito("Experiência com liderança");
  
  console.log(cargoDesenvolvedor.mostrar());
  console.log();
  console.log(cargoJunior.mostrar());
  console.log();
  console.log(cargoSenior.mostrar());