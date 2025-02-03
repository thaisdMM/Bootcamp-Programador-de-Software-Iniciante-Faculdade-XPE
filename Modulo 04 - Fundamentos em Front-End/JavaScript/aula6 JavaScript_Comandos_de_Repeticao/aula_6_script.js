console.log("imprimindo de 01 a 05 com while");

var contador1 = 1;
while (contador1 <= 5) {
  console.log(contador1);
  contador1++;
}

console.log("imprimindo de 01 a 05 com do while");

var contador2 = 1;
do {
  console.log(contador2);
  contador2++;
} while (contador2 <= 5);

console.log("imprimindo de 01 a 05 com for");

for (var contador3 = 1; contador3 <= 5; contador3++) {
  console.log(contador3);
}

var contador4 = 1;
console.log("imprimindo de 01 a 05 com for e break");

for (;contador4 <= 5; contador4++) {
  console.log(contador4);
  if(contador4 === 3)
  {break;}
  
}

var contador5 = 1;
console.log("imprimindo de 01 a 05 com for e continue");

for (;contador5 <= 5; contador5++) {
   if(contador5 === 3)
      {continue;}
    
   console.log(contador5);
}
