// objetos tem dados e ações(comportamentos)
// this depende de como a função foi chamada e nao de como ela foi definida


function Retangulo(altura, largura) {
   this.altura = altura;
   this.largura = largura;
   this.area = calculaArea;

}
//referenciando o this, mas nao está dentro do consultor Retangulo, mas refencia o objeto retangulo, mesmo a funççao estando do lado de fora
function calculaArea() {
      return this.altura * this.largura;
   }

   /* teste no console
   
   Live reload enabled.
var r1 = new Retangulo(4,7)
undefined
r1.area()
28
var fn = r1.area
undefined
fn()
NaN
calculaArea();
NaN
r1.area()
28
var fn2 = calculaArea.bind(r1)
undefined
fn2()
28
   */