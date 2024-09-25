package pacoteBreakContinue;

import java.util.*;

public class AulaBreakContinue {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0, somatorio = 0;
		
		System.out.println("Digite o número desejado: ");
		numero = entrada.nextInt();
		
		while (numero > 0) {
			somatorio = somatorio + numero;
			
			System.out.println("Digite o número desejado: ");
			numero = entrada.nextInt();
			
			if (numero == 18)
				break;
			
		}
		
		System.out.printf("O somatório foi: %d", somatorio);
	}

}
