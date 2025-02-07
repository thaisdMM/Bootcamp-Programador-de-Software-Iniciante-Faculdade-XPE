var tbody = document.getElementById("tabuleiro");
var proximoJogador = "O";

function fazJogada(l, c) {
  var tr = tbody.children[l];
  var td = tr.children[c];

  if (td.textContent == "") {
    td.textContent = proximoJogador;

    if (jogadorVenceu(proximoJogador)) {
      console.log("jogador venceu: " + proximoJogador);
    } else {
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
    if (cel(0, i) == jog && cel(1, i) == jog && cel(2, i) == jog) {
      return true;
    }
  }
  if (cel(0, 0) == jog && cel(1, 1) == jog && cel(2, 2) == jog) {
    return true;
  }
  if (cel(0, 2) == jog && cel(1, 1) == jog && cel(2, 0) == jog) {
    return true;
  }
  return false;
}
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
