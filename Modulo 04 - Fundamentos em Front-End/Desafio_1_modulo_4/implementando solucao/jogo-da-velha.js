function fazJogada(l, c) {
  var proximoJogador = "O";

  var tbody = document.getElementById("tabuleiro");
  var tr = tbody.children[l];
  var td = tr.children[c];

  td.textContent = proximoJogador;

  if (proximoJogador == "O") {
    proximoJogador == "X";
  } else {
    proximoJogador == "O";
  }

  console.log("clicou na celula " + l + " " + c);
}
