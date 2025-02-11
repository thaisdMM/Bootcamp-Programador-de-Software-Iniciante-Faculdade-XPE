//1. Declarar variáveis com let e const

/* let a = 1; // let pode ser alterada depois
const b = 1; // const não pode ser alterada depois

a = 2;
//b = 2; erro de tipo, pois nao pode ser modificada depois

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
teste(); */

//2. Usar atribuição via desestruturação

let primos = [2, 3, 5, 7, 11, 13];

let curso = {
  nome: "Bootcamp Front End",
  modulos: 4,
  presencial: false,
  turma: 1,
};

//está desmembrando o array primos
let [p1, p2, ... resto] = primos;