function Retangulo(altura, largura) {
  this.altura = altura;
  this.largura = largura;
  this.area = function calculaArea() {
    return this.altura * this.largura;
  };
}

var r1 = new Retangulo (3, 4);
var r2 = new Retangulo (7, 2);