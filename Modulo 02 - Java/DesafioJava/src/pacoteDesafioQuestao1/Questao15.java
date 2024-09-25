package pacoteDesafioQuestao1;

import java.util.Random;
import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int [] valores = new int[1000], repeticoes = new int[1000];
		int limiteSuperior = 100;
		Random random = new Random(); //classe para gerar numeros aleatorios
		
		for (int i = 0; i < 1000; i++)
			valores[i] = random.nextInt(limiteSuperior); //metodo para gerar numeros aleatorios

		for (int i = 0; i < 1000; i++) {
			repeticoes[ valores[i] ]++;
		}
		/*for (int i = 0; i < 100; i++)
			if (repeticoes[i] > 15 || repeticoes[i] < 6)
			System.out.printf("O número %d repete %d vezes.\n", i, repeticoes[i]);*/
		
		for (int i = 0; i < 100; i++)
			if (repeticoes[i] > 15 && repeticoes[i] < 6)
			System.out.printf("O número %d repete %d vezes.\n", i, repeticoes[i]);
	}

}
