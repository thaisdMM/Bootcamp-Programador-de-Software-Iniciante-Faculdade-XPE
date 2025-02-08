// objetos tem dados e ações(comportamentos)
// this depende de como a função foi chamada e nao de como ela foi definida


function Retangulo(altura, largura) {
   this.altura = altura;
   this.largura = largura;
   this.area = function() {
      return this.altura * this.largura;
   }

}