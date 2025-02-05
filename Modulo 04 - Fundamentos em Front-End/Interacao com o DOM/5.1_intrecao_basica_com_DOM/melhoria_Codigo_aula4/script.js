// Seleciona os elementos HTML da caixa e do diagrama
var caixa = document.getElementById("caixa");
var diagrama = document.getElementById("diagrama");

// Variáveis para armazenar a posição inicial do clique
var cx, cy;

// Função para atualizar a posição da caixa na tela
function setPos(x, y) {
  caixa.style.top = y + "px";
  caixa.style.left = x + "px";
}

// Adiciona um evento para iniciar o arraste ao clicar na caixa
caixa.addEventListener("mousedown", iniciaArraste);

// Adiciona um evento para parar o arraste quando o mouse for solto
document.addEventListener("mouseup", terminaArraste);

// Função chamada quando o usuário clica na caixa para iniciar o arraste
function iniciaArraste(evt) {
  // Captura a diferença entre a posição do clique e a posição da caixa
  cx = evt.clientX - pxParaNum(caixa.style.left);
  cy = evt.clientY - pxParaNum(caixa.style.top);

  // Adiciona a classe para destacar que a caixa está sendo arrastada
  caixa.classList.add("arrastando");

  // Adiciona um evento para mover a caixa enquanto o mouse estiver pressionado
  document.addEventListener("mousemove", arrasta);
}

// Função chamada quando o usuário solta o mouse
function terminaArraste() {
  // Remove corretamente a classe quando o arraste termina
  caixa.classList.remove("arrastando");

  // Remove o evento de movimentação para parar o arraste
  document.removeEventListener("mousemove", arrasta);
}

// Função chamada sempre que o mouse se move durante o arraste
function arrasta(evt) {
  // Calcula a nova posição da caixa baseada na posição do mouse
  var x = evt.clientX - cx;
  var y = evt.clientY - cy;

  // Define os limites do movimento dentro do diagrama
  var maxX = diagrama.clientWidth - caixa.clientWidth; // Máximo permitido no eixo X
  var maxY = diagrama.clientHeight - caixa.clientHeight; // Máximo permitido no eixo Y

  // Impede que a caixa ultrapasse os limites do diagrama
  x = Math.max(0, Math.min(x, maxX)); // Garante que x fique entre 0 e maxX
  y = Math.max(0, Math.min(y, maxY)); // Garante que y fique entre 0 e maxY

  // Atualiza a posição da caixa chamando a função setPos
  setPos(x, y);
}

// Função para converter valores em pixels ("px") para número
function pxParaNum(s) {
  return +s.replace("px", ""); // Remove "px" e converte para número
}
