//IF ELSE

/*function maior(a, b) {
  if (a > b) {
    return a;
  } //else {} não é necessário nesse caso
    return b;
}*/

function maior(a, b, c) {
  if (a > b && a > c) {
    return a;
  } else if (b > a && b > c) {
    return b;
  } else {
    return c;
  }
}
//TERNARIO
//expressao ternario após a interrogaçao (a>b)? se maior retorna a,
// senao : e o valor que retorna se a expressao for falsa
// a expressao ternaria é uma expressao e retorna diretamente, nao precisa guardar em uma variável

/*function menor(a, b) {
  return a < b ? a : b;
}*/

function menor(a, b, c) {
  return a < b && a < c ? a : b < a && b < c ? b : c;
}

//SWITCH
/* Podia ser feito com IF mas daria muito trabalho e muito codigo
function formataMes(mes) {
  if (mes === 1) {
    return "Janeiro";
  } else if (mes === 2) {
    return "Fevereiro";
  }
}*/

function formataMes(mes) {
  switch (mes) {
    case 1:
      return "Janeiro";
      break;
    case 2:
      return "Fevereiro";
      break;
    case 3:
      return "Março";
      break;
    default:
      return "Não implementei ainda";
      break;
  }
}
