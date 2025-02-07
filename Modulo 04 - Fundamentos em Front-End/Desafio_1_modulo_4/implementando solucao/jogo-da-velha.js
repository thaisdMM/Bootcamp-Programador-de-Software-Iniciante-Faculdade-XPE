var tbody = document.getElementById("tabuleiro");
var proximoJogador = "O";

function fazJogada(l, c) {
  var tr = tbody.children[l];
  var td = tr.children[c];

  if (td.textContent == "") {
    td.textContent = proximoJogador; //Melhor momento para verificar um vencedor é após terminar de marcar a jogada

    if (jogadorVenceu(proximoJogador)) {
      //
      console.log("jogador venceu: " + proximoJogador);
    } else {
      //se nao venceu continua a jogada
      if (proximoJogador == "O") {
        proximoJogador = "X";
      } else {
        proximoJogador = "O";
      }
    }
  }
}

function jogadorVenceu(jog) {
  for (var i = 0; i < 3; i++) {
    if (cel(i, 0) == jog && cel(i, 1) == jog && cel(i, 2) == jog) {
      return true;
    }
  }
  for (var j = 0; j < 3; j++) {
    if (cel(0, j) == jog && cel(1, j) == jog && cel(2, j) == jog) {
      return true;
    }
  }
  return false;
}
//função auxiliar para reduzir o tamanho do codigo jogadorVenceu
function cel(l, c) {
  return tbody.children[l].children[c].textContent;
}

function reinicia() {
  proximoJogador = "O";
  for (var i = 0; i < 3; i++) {
    var tr = tbody.children[i];

    for (var j = 0; j < 3; j++) {
      var td = tr.children[j];
      td.textContent = "";
    }
  }
}
