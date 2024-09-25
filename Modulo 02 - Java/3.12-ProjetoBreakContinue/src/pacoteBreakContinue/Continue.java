package pacoteBreakContinue;

import java.util.*;

public class Continue {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0, somatorio = 0;

		do {
			
			System.out.println("Digite números positivos ou 0 para sair.");
			numero = entrada.nextInt();
			
			if (numero == 18)
				continue;//com o numero sendo 18 ele nao vai ser computado no somatorio e continua pulando a proxima iteracao
			
			somatorio = somatorio + numero;
			
		} while (numero > 0); 
		
		System.out.printf("O somatório é: %d.", somatorio);
	}

}
