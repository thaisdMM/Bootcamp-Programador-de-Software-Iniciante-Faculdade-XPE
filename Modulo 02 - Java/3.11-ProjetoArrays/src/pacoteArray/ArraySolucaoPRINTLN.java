package pacoteArray;

import java.util.*;

public class ArraySolucaoPRINTLN{

    public static void main(String[] args) {
        
        int[] numeros = new int[10];    
        int total = 0, i = 0;
        Scanner entrada = new Scanner(System.in);
        
        for(i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i+1) + " número: ");
            numeros[i] = entrada.nextInt();
            total = total + numeros[i];
            System.out.println("Total parcial: " + total);
        }
        
        System.out.println("O valor total é: " + total);
    }
}