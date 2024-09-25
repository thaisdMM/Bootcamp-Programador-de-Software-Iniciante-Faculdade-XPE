package pacoteDesafioQuestao1;

import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int[] numerosDigitados = new int[10];
		int[] numerosFixos = {1,2,3,4,5,6,7, 8, 9, 10};
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %d número:\n", i+1);
			numerosDigitados[i] = ent.nextInt();
		}
			for (int i = 0; i < 10; i++) {
				System.out.printf("%d x %d = %d\n", numerosDigitados[i], numerosFixos[i], numerosDigitados[i] * numerosFixos[i]);
				
		
		}
		}

}
