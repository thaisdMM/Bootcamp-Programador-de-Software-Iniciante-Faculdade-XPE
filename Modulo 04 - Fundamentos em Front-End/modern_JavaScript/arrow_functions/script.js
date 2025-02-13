function soma(a, b){
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

var somaV2 = (a, b) => {
   return a + b;
}
