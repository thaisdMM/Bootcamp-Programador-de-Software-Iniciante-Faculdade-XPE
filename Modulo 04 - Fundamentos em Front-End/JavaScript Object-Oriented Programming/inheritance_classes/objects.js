class Retangulo {
  constructor(altura, largura) {
    this.altura = altura;
    this.largura = largura;
  }

  area() {
    return this.altura * this.largura;
  }
}

//extends é a herança e cria uma subclasse de retangulo
//no construtor da subclasse tem que chamar o construtor da suplerclasse(super)
class Quadrado extends Retangulo {
  constructor(dimensao) {
    super(dimensao, dimensao);
  }
}

var r1 = new Retangulo(3, 4);
var r2 = new Retangulo(3, 8);

var r3 = new Quadrado(3);
