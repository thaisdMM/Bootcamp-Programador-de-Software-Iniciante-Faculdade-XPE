var fslist = document.querySelectorAll(".multiple-field");

for (var i = 0; i < fslist.length; i++) {
  initMultipleFieldSet(fslist[i]);
}

function initMultipleFieldSet(fs) {
  var addButton = document.createElement("button");
  addButton.textContent = "Adicionar";
  addButton.type = "button";

  fs.appendChild(addButton);

  var  firstInput = fs.querySelector("input");

  addButton.addEventListener("click", function () {
    var div = document.createElement("div");
    var newInput = document.createElement("input");
    newInput.name = firstInput.name;
    newInput.type = firstInput.type;
   

    div.appendChild(newInput);

    fs.insertBefore(div, addButton);
  });
}
