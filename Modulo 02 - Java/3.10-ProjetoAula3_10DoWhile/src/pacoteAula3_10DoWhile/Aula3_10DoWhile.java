package pacoteAula3_10DoWhile;

import java.util.*;

public class Aula3_10DoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		char continuar = ' ';
		System.out.println("Deseja continuar (S - Sim. N - Não)?");
		continuar = entrada.nextLine().charAt(0);
		
		/*while (continuar == 'S') {
			System.out.println("Mensagem");
			System.out.println("Deseja continuar (S - Sim. N - Não)?");
			continuar = entrada.nextLine().charAt(0);
			
		}
		*/
		do {
			System.out.println("Mensagem");
			//System.out.println("Deseja continuar (S - Sim. N - Não)?");
			//continuar = entrada.nextLine().charAt(0);
			
		} while (continuar == 'S');
		
	}

}
