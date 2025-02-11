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
teste(); 

//2. Usar atribuição via desestruturação

let primos = [2, 3, 5, 7, 11, 13];

let curso = {
  nome: "Bootcamp Front End",
  modulos: 4,
  presencial: false,
  turma: 1,
};

//está desmembrando o array primos
let [p1, p2, ...resto] = primos; //...resto chama o restante do array depois de p2

//desestruturação de objetos - na estruturaçao da declaração de um parâmetro ou de uma variável

//pode trocar o nome da variavel
let { nome : nomeCurso, turma, ...outrosCampos } = curso;// ...(rest operator)

//desestruturação em parametros de funções

function imprime({nome}) {
   console.log(nome);
}



//3. Spread Operator

let primos = [2, 3, 5, 7, 11, 13];
let curso = {
  nome: "Bootcamp Front End",
  modulos: 4,
  presencial: false,
  turma: 1,
};

// adicinou 17 no final de primos
let primos2 = [...primos, 17];

// adicionou 1 + primos + 17
let primos3 = [1, ...primos, 17];

//SPREAD para o objeto

//spread para adcionar campos para mais
let curso2 = {
  ...curso,
  descricao: "bla bla bla",
  ativo: true,
};

//spread sem adcionar campos para mais: clona o objeto original, mas cria um novo objeto curso != curso3

let curso3 = {
  ...curso,
};

*/

//4. TEMPLATE LITERALS

let a = 2, b = 3;
let soma = a + b;

console.log(a + " + " + b + " = " + soma);

// escreve dentro de 2 crases
//faz a soma de fomrma mais concisa e entendível
//não precisa ter substituição de variáveis, pode ter só string dentro da crase
console.log(`${a} + ${b} = ${soma}`);
