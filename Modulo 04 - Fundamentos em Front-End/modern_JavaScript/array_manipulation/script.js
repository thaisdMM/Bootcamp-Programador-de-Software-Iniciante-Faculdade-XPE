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
// dá para transformar os dados

let names = usPresidents.map((item) => item.president);


// 4. FILTER

// permite filtar elementos do array
// filter e map retornam um novo array e podem ser realizadas outras operações em cima desse array

let replublicans = usPresidents
.filter((item) => item.party == "Republican")
.map((item) => item.president);

// 5. FIND

// Acha sempre o primeiro objeto do array

let p1 = usPresidents.find((item) => item.party == "Democratic");

// 6. SORT

// diferente das anteriores ela nao cria um novo array ela ordena o proprio array aonde foi chamada a função
// esse codigo vai retornar os nomes em ordem alfabética

usPresidents.sort((i1, i2) => {
   if(i1.president <i2.president) {
      return -1;
   } else if (i1.president > i2.president) {
      return 1;
   }else {
      return 0;
   }
});
