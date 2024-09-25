package pacoteExemploString;

public class Aula2_7PrintPrintlnPrintf {

	public static void main(String[] args) {
		
		int idade = 30;
		
		double altura = 1.81;
		
		String nome = "Joaquim José da Silva";
		
		boolean estudante = true;
		
		char sexo = 'M';
				
		System.out.print("Olá Mundo!");
		
		System.out.print(idade);
		
		System.out.print("idade");
		
		System.out.println("idade: " + idade);
		
		System.out.println(" Altura: " + altura);
		
		//%s String
		//%d Int
		//%.4f Float ou Double com quatro casas decimais
		//b Boolean
		//%c Caractere(char)
		
		idade = 35;
		altura = 1.60;
		
		//System.out.printf("A idade é %d e a altura é %.2f .", idade, altura );
		
		//System.out.printf("A idade é %d e a altura é %.2f . O nome é %s .", idade, altura, nome );
		
		System.out.printf("A idade é %d e a altura é %.2f . O nome é %s e o sexo é %c. É estudante? %b", idade, altura, nome, sexo, estudante );
		
		System.out.printf("\nA idade é %d e a altura é %.2f.\n O nome é %s e o sexo é %c.\n É estudante? %b", idade, altura, nome, sexo, estudante );

	}

}
