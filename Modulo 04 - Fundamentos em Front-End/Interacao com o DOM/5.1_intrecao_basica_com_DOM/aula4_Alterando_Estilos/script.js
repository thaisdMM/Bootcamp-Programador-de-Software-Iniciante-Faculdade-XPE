var caixa = document.getElementById("caixa");

function setPos(x, y) {
  caixa.style.top = y + "px";
  caixa.style.left = x + "px";
}

caixa.addEventListener("mousedown", iniciaArraste);
document.addEventListener("mouseup", terminaArraste);

function iniciaArraste(evt) {
  caixa.classList.add("arrastando");
  caixa.addEventListener("mousemove", arrasta);
}

function terminaArraste(evt) {
  caixa.classList.remove = "arrastando";
  caixa.removeEventListener("mousemove", arrasta);
}

function arrasta(evt) {
  var x = evt.clientX;
  var y = evt.clientY;
  setPos(x, y);
}
