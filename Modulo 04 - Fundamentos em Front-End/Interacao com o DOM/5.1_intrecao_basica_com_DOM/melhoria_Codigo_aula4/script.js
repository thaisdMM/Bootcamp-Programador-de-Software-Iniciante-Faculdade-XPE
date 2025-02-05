var caixa = document.getElementById("caixa");
var diagrama = document.getElementById("diagrama");
var cx, cy;

function setPos(x, y) {
  caixa.style.top = y + "px";
  caixa.style.left = x + "px";
}

caixa.addEventListener("mousedown", iniciaArraste);
document.addEventListener("mouseup", terminaArraste);

function iniciaArraste(evt) {
  cx = evt.clientX - pxParaNum(caixa.style.left);
  cy = evt.clientY - pxParaNum(caixa.style.top);

  caixa.classList.add("arrastando");
  document.addEventListener("mousemove", arrasta);
}

function terminaArraste(evt) {
  caixa.classList.remove = "arrastando";
  document.removeEventListener("mousemove", arrasta);
}

function arrasta(evt) {
  var x = evt.clientX;
  var y = evt.clientY;
  setPos(x - cx, y - cy);

  // Define os limites do movimento dentro do diagrama
  var maxX = diagrama.clientWidth - caixa.clientWidth; // Máximo permitido no eixo X
  var maxY = diagrama.clientHeight - caixa.clientHeight; // Máximo permitido no eixo Y

  // Impede que a caixa ultrapasse os limites do diagrama
  x = Math.max(0, Math.min(x, maxX)); // Garante que x fique entre 0 e maxX
  y = Math.max(0, Math.min(y, maxY)); // Garante que y fique entre 0 e maxY

  setPos(x, y);
}

function pxParaNum(s) {
  return +s.replace("px", "");
}
