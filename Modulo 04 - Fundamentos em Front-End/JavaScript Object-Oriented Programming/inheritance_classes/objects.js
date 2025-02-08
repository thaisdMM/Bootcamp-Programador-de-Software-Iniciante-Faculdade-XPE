class Retangulo {
  constructor(altura, largura) {
    this.altura = altura;
    this.largura = largura;
  }

  area() {
    return this.altura * this.largura;
  }
}

var r1 = new Retangulo(3, 4);
var r2 = new Retangulo(3, 8);
