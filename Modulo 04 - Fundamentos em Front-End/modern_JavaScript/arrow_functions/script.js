function soma(a, b) {
  return a + b;
}

function Retangulo(altura, largura) {
  this.altura = altura;
  this.largura = largura;
  this.area = function () {
    return this.altura * this.largura;
  };
}

//Codigo com arrow function

//quando a função é uma unica expressao e ela retorna essa expressao pode tirar as chaves e a palara chave return:

var somaV2 = (a, b) => a + b;


