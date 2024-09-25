package pacoteArray;

import java.util.*;

public class ArraySimplificadoCorreto {

	public static void main(String[] args) {
		
	int [ ] numeros = new int [5];	
	int total = 0, i = 0;
	Scanner entrada = new Scanner(System.in);
	
	for(i = 0; i < 5; i++) {
		System.out.printf("Digite o %d número: ", i+1);
		numeros[i] = entrada.nextInt();
		total = total + numeros[i];
		System.out.printf("Total parcial: %d.\n", total);
	}
	
	System.out.printf("O valor total é: %d", total);
	
	}

}
