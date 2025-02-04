
var fslist = document.querySelectorAll(".multiple-field");

for (var i = 0; i < fslist.length; i++){
   initMultipleFieldSet(fslist[i]);
}

function initMultipleFieldSet(fs) {
   var addButton = document.createElement("button");
   addButton.textContent = "Adicionar";

   fs.appendChild(addButton);
}