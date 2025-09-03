class Singleton{
    constructor(){
        console.log("Construtor - Existe uma instância deste objeto")
        if(Singleton.instance == null){
            Singleton.instance = this;
            this.value = 0;
            console.log("Não - então cria-se uma insância deste objeto")
        }
        console.log("Retorna - Singleton.instance")
        return Singleton.instance;
    }

    increment(){
        this.value += 1;
        console.log(`Value: ${this.value}`);
    }
}

// Utilização / Cliente:
console.log("Solicita instanciamento S1")
const s1 = new Singleton();
console.log("Solicita instanciamento S2")
const s2 = new Singleton();
console.log("Solicita instanciamento S3")
const s3 = new Singleton();

console.log(s1 === s2);
console.log(s1 === s3);

s1.increment();
s1.increment();
s1.increment();
