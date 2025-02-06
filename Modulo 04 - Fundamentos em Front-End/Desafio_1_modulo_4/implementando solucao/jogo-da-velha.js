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
