class Forma {
    constructor(x, y, cor) {
      this.x = x;
      this.y = y;
      this.cor = cor;
    }
  
    clone() {
      return new Forma(this.x, this.y, this.cor);
    }
  
    mostrar() {
      return `Posição: (${this.x}, ${this.y}), Cor: ${this.cor}`;
    }
  }
  
  class Circulo extends Forma {
    constructor(x, y, cor, raio) {
      super(x, y, cor);
      this.raio = raio;
    }
  
    clone() {
      return new Circulo(this.x, this.y, this.cor, this.raio);
    }
  
    mostrar() {
      return `Círculo - ${super.mostrar()}, Raio: ${this.raio}`;
    }
  }
  
  class Retangulo extends Forma {
    constructor(x, y, cor, largura, altura) {
      super(x, y, cor);
      this.largura = largura;
      this.altura = altura;
    }
  
    clone() {
      return new Retangulo(this.x, this.y, this.cor, this.largura, this.altura);
    }
  
    mostrar() {
      return `Retângulo - ${super.mostrar()}, Largura: ${this.largura}, Altura: ${this.altura}`;
    }
  }
  
  const circuloOriginal = new Circulo(10, 20, "azul", 15);
  const circuloClonado = circuloOriginal.clone();
  circuloClonado.x = 30;
  
  const retanguloOriginal = new Retangulo(5, 5, "vermelho", 100, 50);
  const retanguloClonado = retanguloOriginal.clone();
  retanguloClonado.cor = "verde";
  
  console.log(circuloOriginal.mostrar());
  console.log(circuloClonado.mostrar());
  console.log();
  console.log(retanguloOriginal.mostrar());
  console.log(retanguloClonado.mostrar());
  