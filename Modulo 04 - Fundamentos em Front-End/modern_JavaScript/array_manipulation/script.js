// 1. FOR ... OF

/* Jeito de declarar antes 

for (let i = 0; i < usPresidents.length; i++) {
  usPresidents[i];
}
  */

for (let item of usPresidents) {
  // console.log(item.president)
}

// 2. FOREACH

usPresidents.forEach((item, index) => {
  //  console.log(`${index} ${item.president}`)
});

// 3. MAP
// > função de array que recebe uma outra função como parametro

let names = usPresidents.map((item) => item.president);
