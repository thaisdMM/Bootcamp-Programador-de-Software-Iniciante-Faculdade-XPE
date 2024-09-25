package pacoteAula3_5IfElseIf;
import java.util.*;
import java.math.*;

public class Aula3_5IfElseIf {

	public static void main(String[] args) {
		
		double peso, altura, imc;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o peso: ");
		peso = entrada.nextDouble();
		
		System.out.println("Digite a altura: ");
		altura = entrada.nextDouble();
		
		imc = peso/(altura * altura);
		System.out.printf("Seu IMC é: %.2f.\n", imc);
		
		if(imc < 18.5)
			System.out.println("Abaixo do peso");
		
		else if (imc >= 18.5 && imc < 25)
			System.out.println("IMC normal");
		
		else if (imc >= 25 && imc < 30)
			System.out.println("Sobrepeso");
		else if (imc >= 30 && imc < 35)
			System.out.println("Obesidade grau I");
		else if(imc >= 35 && imc < 40)
			System.out.print("Obesidade grau II");
		
		else
			System.out.println("Obesidade grau III");
			
		
		
	}

}
