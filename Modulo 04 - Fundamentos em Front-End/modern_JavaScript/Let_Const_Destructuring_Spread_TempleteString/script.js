// Declarar variáveis com let e const

let a = 1; // let pode ser alterada depois
const b = 1; // const não pode ser alterada depois

a = 2;
/*b = 2; erro de tipo, pois nao pode ser modificada depois*/

function teste() {
  for (var i = 0; i < 5; i++) {
    //var escopo global
    //fazer algo
  }
  for (let j = 0; j < 5; j++) {
    //let scopo apenas o bloco que está declarada >É MAIS SEGURO QUE VAR
    //fazer algo
    console.log("j: " + j); // agora imprimiu
  }
  console.log("i: " + i);
}
teste();
