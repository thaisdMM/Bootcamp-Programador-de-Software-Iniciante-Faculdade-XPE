package pacoteForWhileDoWhile;
import java.util.*;
import java.math.*;

public class Aula3_8For {

	public static void main(String[] args) {
		
		//for (inicialização; condição; incremento)
		int i = 0, j = 0, z = 0;
		
		System.out.println("Inicio. Não vai repetir.");
		for (i = 0; i < 5; i++) {
			
		//for (i = 0; i < 10; i++) {
		//for (i = 1; i <= 100; i = i +2) {
		//for (i = 100; i >= 0; i--) {
		//for (i = 100; i >= 0; i = i - 2) {		
			System.out.printf("Valor de i: %d\n", i);
			for (j = 0; j < 3; j++)	{
				System.out.printf("   valor de j: %d\n", j);
				for (z = 0; z < 2; z++){
					System.out.printf("      valor de z: %d\n", z);
				}
			}
		}
		
		System.out.println("Fim. Não vai repetir.");
		
	}

}
