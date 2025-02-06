var proximoJogador = "O";

function fazJogada(l, c) {
  var tbody = document.getElementById("tabuleiro");
  var tr = tbody.children[l];
  var td = tr.children[c];

  if (td.textContent == "") {
    td.textContent = proximoJogador;
    if (proximoJogador == "O") {
      proximoJogador = "X";
    } else {
      proximoJogador = "O";
    }
  }

  console.log("clicou na celula " + l + " " + c);
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
