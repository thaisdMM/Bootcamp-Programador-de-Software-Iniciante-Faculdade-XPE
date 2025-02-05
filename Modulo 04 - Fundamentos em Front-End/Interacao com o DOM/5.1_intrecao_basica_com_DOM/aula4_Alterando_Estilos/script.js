var caixa = document.getElementById("caixa");
var cx, cy;

function setPos(x, y) {
  caixa.style.top = y + "px";
  caixa.style.left = x + "px";
}

caixa.addEventListener("mousedown", iniciaArraste);
document.addEventListener("mouseup", terminaArraste);

//cx e cy fazendo a correçao do x e do y em relacao ao pai para nao ficar em relação a viewport
function iniciaArraste(evt) {
  cx = evt.clientX - pxParaNum(caixa.style.left);
  cy = evt.clientY - pxParaNum(caixa.style.top);

  caixa.classList.add("arrastando");
  document.addEventListener("mousemove", arrasta);
}

function terminaArraste(evt) {
  caixa.classList.remove = ("arrastando");
  document.removeEventListener("mousemove", arrasta);
}

function arrasta(evt) {
  var x = evt.clientX;
  var y = evt.clientY;
  setPos(x - cx, y - cy);
}

//função para transformar os pixels(String) em numero
// operador + para converter para numero
function pxParaNum(s) {
  return +s.replace("px", "");
}
