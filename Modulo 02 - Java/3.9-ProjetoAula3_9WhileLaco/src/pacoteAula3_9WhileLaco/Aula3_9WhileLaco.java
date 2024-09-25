package pacoteAula3_9WhileLaco;

import java.util.Scanner;

public class Aula3_9WhileLaco {

	public static void main(String[] args) {
		char saida = 'N';
		Scanner entrada = new Scanner(System.in);
		int numero = 0, somatorio = 0, contaNumeros = 0;
		while (saida != 'S') {
			System.out.println("Digite um número: ");
			numero = entrada.nextInt();
			entrada.nextLine();
			System.out.println("Gostaria de sair (S - Sim. N - Não)?");
			saida = entrada.nextLine().charAt(0);
			somatorio = somatorio + numero;
			contaNumeros++;
		}
		System.out.printf("O somatório é %d", somatorio);
		System.out.printf("\nForam digitados %d números.", contaNumeros);
		System.out.println("\nPrograma encerrado.");
		
	}

}
