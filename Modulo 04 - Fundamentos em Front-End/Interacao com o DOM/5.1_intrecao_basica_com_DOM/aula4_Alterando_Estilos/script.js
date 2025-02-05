var caixa = document.getElementById("caixa");

function setPos(x, y) {
  caixa.style.top = y + "px";
  caixa.style.left = x + "px";
}

caixa.addEventListener("mousedown", iniciaArraste);

function iniciaArraste(evt) {
   caixa.className = "arrastando";

}

caixa.addEventListener("mouseup", terminaArraste);

function terminaArraste(evt) {
   caixa.className = "";
}
