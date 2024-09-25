// Objetos

var aluno1 = {
  matricula: 7689779,
  nome: "Thais Moreira",
  curso: "Bootcamp Front End",
  ativo: true,
};

console.log(aluno1.nome);

aluno1.dataNascimento = "28/01/1986";
console.log(aluno1.dataNascimento);

delete aluno1.dataNascimento;

var x; //nao foi inicializada. dá undefined > variavel nao definida
var y = null; //null é diferente de undefined

// Arrays

var frutas = ["Banana", "Laranja", "Maçã"];
