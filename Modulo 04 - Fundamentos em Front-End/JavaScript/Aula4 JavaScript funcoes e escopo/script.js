/*function imprimeOla() {
  console.log("Olá");
}*/

function soma(op1, op2) {
  return op1 + op2;
}

var m = "Olá"; //variável global: fora da função

//voce pode chamar a impressao antes da função que ela contabiliza como se a função viesse depois,
//porém vc nao pode chamar a impressao antes da variavel global pq ela nao será imprimida

imprimeOla();

imprimeOla3();

//imprimeOla2();

function imprimeOla() {
  var nome = "Thais";
  console.log(m);
  console.log(nome);
}

//esse imprimeOla2 dá ERRO na hora de chamar o nome porque ele não tem essa variavel definida
function imprimeOla2() {
  console.log(m);
  console.log(nome);
}

function imprimeOla3() {
  var nome = "Thais Moreira";
  console.log(m);
  console.log(nome);
  imprimeOla4();

  //função dentro da outra funçao
  // DIFERENTE do imprimeOla2 NÃO dá ERRO na hora de chamar o nome porque está dentro da funcao que tem o nome definido
  function imprimeOla4() {
    console.log(m);
    console.log(nome);
  }
}
