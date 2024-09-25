package pacoteExemplo;
import java.util.*;
import java.math.*;

public class Aula3_4IfsAninhados {

	public static void main(String[] args) {
	int n1, n2;
	Scanner entrada = new Scanner (System.in);
	
	System.out.println("Digite o primeiro numero: ");
	n1 = entrada.nextInt();
	
	System.out.println("Digite o segundo numero: ");
	n2 = entrada.nextInt();
	
	if(n1 == n2)
		System.out.println("Os números são iguais.");
	else {
		if (n1 > n2)
			System.out.println("N1 é maior que N2.");
		else
			System.out.println("N2 é maior que N1");
	
	}
		
	}

}
