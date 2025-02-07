var proximoJogador = "O";

function fazJogada(l, c) {
  var tbody = document.getElementById("tabuleiro");
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
   var tbody = document.getElementById("tabuleiro");
   var td00 = tbody.children[0].children[0].textContent;
   var td01 = tbody.children[0].children[1].textContent;
   var td02 = tbody.children[0].children[2].textContent;
   
   if(td00 == jog && td01 == jog && td02 == jog) {
      return true;

   }


}

function reinicia() {
  proximoJogador = "O";
  var tbody = document.getElementById("tabuleiro");

  for (var i = 0; i < 3; i++) {
    var tr = tbody.children[i];

    for (var j = 0; j < 3; j++) {
      var td = tr.children[j];
      td.textContent = "";
    }
  }
}
