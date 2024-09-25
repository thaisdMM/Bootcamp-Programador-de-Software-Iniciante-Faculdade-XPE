package pacoteDesafioQuestao1;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		int n1 = 0;
		boolean resultado;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		n1 = entrada.nextInt();
		
		resultado = (n1 % 2 == 0); //operacao boleana
		System.out.printf("O número digitado foi: %d. O resultado da operação boeleana foi %b.",n1, resultado);
		
	}

}
