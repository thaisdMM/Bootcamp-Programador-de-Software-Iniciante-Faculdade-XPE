package pacoteAula2_11OperadoresLogicos;

public class Aula2_11OperadoresLogicos {

	public static void main(String[] args) {
		int var1 = 10, var2 = 20;
		boolean resultado;
		
		//Igual a ==
		
		resultado = (var1 == var2);
		
		System.out.printf("As variaveis são iguais? \nResposta: %b", resultado);

		var1 = 20;
		var2 = 20;
		resultado = (var1 == var2);
		
		System.out.printf("\nAs variaveis são iguais? \nResposta: %b\n", resultado);
		
		//Diferente !=
		
		resultado = (var1 != var2);
		
		System.out.printf("\nAs variaveis são diferentes? \nResposta: %b\n", resultado);
		
		//Maior >
		
		var1 = 40;
		var2 = 20;
		resultado = (var1 > var2);
		
		System.out.printf("\nAs variavel var1 é maior que a variavel var2? \nResposta: %b\n", resultado);
		
		//Menor <
		
		var1 = 4;
		var2 = 20;
		resultado = (var1 < var2);
		
		System.out.printf("\nAs variavel var1 é menor que a variavel var2 \nResposta: %b\n", resultado);
		
		
		
	}

}
