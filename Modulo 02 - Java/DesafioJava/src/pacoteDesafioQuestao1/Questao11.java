package pacoteDesafioQuestao1;

import java.util.Scanner;
import java.util.Random;

public class Questao11 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int [] valores = new int[1000], repeticoes = new int[1000];
		int limiteSuperior = 100;
		Random random = new Random(); //classe para gerar numeros aleatorios
		
		for (int i = 0; i < 1000; i++)
			valores[i] = random.nextInt(limiteSuperior); //metodo para gerar numeros aleatorios
		
		/*for (int i = 0; i < 1000; i++) {
			repeticoes[ valores[i]]++;
		}
		for (int i = 0; i < 100; i++)
			System.out.printf("O número %d repete %d vezes.\n", i, repeticoes[i]);
			*/ //esse aparece quantas vezes um numero repete ate 99
		
		/*for (int i = 0; i < 1000; i++) {
			repeticoes[i]++;
		}
		for (int i = 0; i < 100; i++)
			System.out.printf("O número %d repete %d vezes.\n", i, repeticoes[i]);*/ //TÁ ERRADO conta 1 vez para cada numero até o 99
		
		for (int i = 0; i < 1000; i++) {
			repeticoes[ valores[i]]++;
		}
		for (int i = 0; i < 100; i++)
			System.out.printf("O número %d repete %d vezes.\n", i, repeticoes[i]);
	}	
	}		