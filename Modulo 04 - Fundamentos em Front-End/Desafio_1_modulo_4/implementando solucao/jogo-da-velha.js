function fazJogada(l, c) {
  var tbody = document.getElementById("tabuleiro");
  var tr = tbody.children[l];
  var td = tr.children[c];

  td.textContent = "0";

  console.log("clicou na celula " + l + " " + c);
}
