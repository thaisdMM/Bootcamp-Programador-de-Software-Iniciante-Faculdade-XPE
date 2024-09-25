//mesmo sem definir a variável m como ela está como função global,
//vai ser chamada em outros scripts e pode levar a erro entre programas

function imprimeOla5() {
  var nome = "Thais";
  console.log(m);
  console.log(nome);
}

imprimeOla5();
