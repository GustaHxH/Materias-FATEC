class Aluno{
    constructor(){
        if (!Aluno.instancia){
            this.nome = ""
            this.notas = {};
            Aluno.instancia = this;
        }
        return Aluno.instancia;
    }
    
    definirNome(nome){
        this.nome = nome;
    }

    addNotas(disciplina, notas){
        this.notas[disciplina] = notas;
    }

    calcularMedia(){
        const total = Object.values(this.notas).reduce((acc, nota) => acc + nota, 0);
        return total / Object.keys(this.notas).length;
    }
}

//Exemplo de uso:
const aluno1 = new Aluno();
aluno1.definirNome("João da Silva");
aluno1.addNotas("Matemática", 8.5);
aluno1.addNotas("Português", 7.0);
aluno1.addNotas("História", 9.2);
console.log(`Média de ${aluno1.nome}: ${aluno1.calcularMedia()}`);

const aluno2 = new Aluno();
aluno2.definirNome("Maria da Silva");
aluno2.addNotas("Matemática", 9.0);
aluno2.addNotas("Português", 5.0);
aluno2.addNotas("História", 8.0);
console.log(`Média de ${aluno2.nome}: ${aluno1.calcularMedia()}`);

console.log(aluno1 === aluno2);