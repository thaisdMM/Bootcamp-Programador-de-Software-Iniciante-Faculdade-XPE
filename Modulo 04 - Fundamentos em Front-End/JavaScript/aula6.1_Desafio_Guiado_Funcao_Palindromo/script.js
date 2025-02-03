palindromo("aba"); // é palindromo
palindromo("radar"); // é palindromo
palindromo("xyzzyx"); // é palindromo
palindromo("bola"); // não é palindromo
palindromo("abcddbc"); // não é palindromo
palindromo(""); // é palindromo
palindromo("x"); // é palindromo

function palindromo(s) {
  //implementar
  if (s.length <= 1) {
    console.log(s + " é palíndromo");
  }  else {
    console.log(s + " é indefinido");
  }
}
