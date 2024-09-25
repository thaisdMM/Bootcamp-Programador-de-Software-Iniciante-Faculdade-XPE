package pacoteForWhileDoWhile;
import java.util.*;

public class Aula3_8ForCorreto {

public static void main(String[] args) {
		
		//for (inicialização; condição; incremento)
		int i = 0, j = 0;
		
		System.out.println("Inicio. Não vai repetir.");
		for (i = 0; i < 5; i++) {
			
			System.out.printf("Valor de i: %d\n", i);
			for (j = 0; j < 3; j++)	{
				System.out.printf("   valor de j: %d\n", j);
				
			}
		}
		
		System.out.println("Fim. Não vai repetir.");
		
	}

}

