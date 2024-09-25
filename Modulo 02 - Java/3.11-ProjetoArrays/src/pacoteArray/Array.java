package pacoteArray;

import java.util.*;
import java.math.*;

public class Array {

	public static void main(String[] args) {
		
		//tipo[] nome = new tipo[tamanho];
		int[] numeros = new int[10];
		int total = 0, i = 0;
		Scanner entrada = new Scanner (System.in);
		
		for (i = 0; i < 10; i++) {
			System.out.printf("Digite o %d° número: ", i+1); //ele coloca esse i+1 que nao muda o valor da variavel mas soma 1 nela na hora de exibir e fica melhor do que ela comecar com o 0 na exibiçao
			numeros[i] = entrada.nextInt();
			total = total + numeros[i];
			System.out.printf("Total parcial: %.d\n", total);
		}
		
		System.out.printf("O valor total é: %d.", total);
		
		
/*		System.out.println ("Digite o 1° número: ");
		numeros[0] = ent.nextInt();
		
		System.out.println ("Digite o 2° número: ");
		numeros[1] = ent.nextInt();
		
		System.out.println ("Digite o 3° número: ");
		numeros[2] = ent.nextInt();
		
		System.out.println ("Digite o 4° número: ");
		numeros[3] = ent.nextInt();
		
		System.out.println ("Digite o 5° número: ");
		numeros[4] = ent.nextInt();
		
		OUTRO MODO DE FAZER, MAS TAMBÉM TRABALHOSO. COMO SABEMOS QUANTOS NUMEROS IREMOS USAR O FOR*/
		
		
		
		
	/*	numeros[0] = 10;
		numeros[1] = 15;
		numeros[2] = 13;
		numeros[3] = 1;
		numeros[4] = 7; isso daria muito trabalho*/
		
/*		total = numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4];
		System.out.printf("O valor total é: %d.", total);
		
		MUDA O TOTAL PARA VARIAVEL I*/
	}

}
