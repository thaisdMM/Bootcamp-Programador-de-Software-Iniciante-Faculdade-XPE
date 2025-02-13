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

function RetanguloV2(altura, largura) {
  this.altura = altura;
  this.largura = largura;
  this.area = () => this.altura * this.largura;
  }


let r1 = new RetanguloV2(5, 6);

//quando a função não tem parametro tem que ter ()
let imprimeMensagem = () => console.log(" ");
