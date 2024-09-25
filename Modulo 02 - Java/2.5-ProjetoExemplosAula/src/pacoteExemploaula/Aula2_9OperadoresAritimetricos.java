package pacoteExemploString;

import java.math.*;

public class Aula2_9OperadoresAritimetricos {

	public static void main(String[]args) {

	//X^2 + 12x - 13 = 0
	
	
	double a, b, c;
	
	a = 1;
	b = 12;
	c = -13;
	
	double delta = 0;
	
	delta = (b * b) - (4 * a * c);
	System.out.printf("O valor do delta é: %.0f\n", delta);		
	
	double x_linha = 0;
	x_linha = (-b + Math.sqrt(delta)) / (2*a);
	System.out.printf("O valor de x' é: %.0f\n", x_linha);
	
	double x_duasLinhas = 0;
	x_duasLinhas = (-b - Math.sqrt(delta)) / (2*a);
	System.out.printf("O valor de x'' é: %.0f\n", x_duasLinhas);
	
	//2x^2 - 16x - 18 = 0
	
	a = 2;
	b = 16;
	c = -18;

	delta = (b * b) - (4 * a * c);
	System.out.printf("O valor do delta é: %.0f\n", delta);		
	
	x_linha = (-b + Math.sqrt(delta)) / (2*a);
	System.out.printf("O valor de x' é: %.0f\n", x_linha);
	
	x_duasLinhas = (-b - Math.sqrt(delta)) / (2*a);
	System.out.printf("O valor de x'' é: %.0f\n", x_duasLinhas);

	

	
}
}