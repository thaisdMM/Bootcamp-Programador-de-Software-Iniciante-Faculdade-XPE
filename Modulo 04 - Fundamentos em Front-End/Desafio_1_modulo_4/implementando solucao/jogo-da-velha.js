var tbody = document.getElementById("tabuleiro");
var msg = document.getElementById("status");
var proximoJogador = "O";
var terminou = false;
msg.textContent = "Aguardando jogada de " + proximoJogador;

function fazJogada(l, c) {
  if (!terminou && cel(l, c) == "") {
    mudaTd(l, c, proximoJogador);

    if (jogadorVenceu(proximoJogador)) {
      msg.textContent = "Jogador " + proximoJogador + " venceu!";
      terminou = true;
    } else if (deuVelha()) {
      msg.textContent = "Deu velha!";
      terminou = true;
    } else {
      if (proximoJogador == "O") {
        proximoJogador = "X";
      } else {
        proximoJogador = "O";
      }
      msg.textContent = "Aguardando jogada de " + proximoJogador;
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

function deuVelha() {
  for (var i = 0; i < 3; i++) {
    for (var j = 0; j < 3; j++) {
      if (cel(i, j) == "") {
        return false;
      }
    }
  }
  return true;
}

function cel(l, c) {
  return tbody.children[l].children[c].textContent;
}

function reinicia() {
  proximoJogador = "O";
  msg.textContent = "Aguardando jogada de " + proximoJogador;
  terminou = false;

  for (var i = 0; i < 3; i++) {
    for (var j = 0; j < 3; j++) {
      mudaTd(i, j, "");
    }
  }
}

function mudaTd(l, c, valor) {
  var td = tbody.children[l].children[c];
  td.textContent = valor;
  td.className = valor;
}
