package pacoteAula2_13PraticaIntegradora;

import java.math.*;

public class Aula2_13PraticaIntegradora {

	public static void main(String[] args) {
		
	double nota1, nota2, nota3, nota4, frequencia, totalNotas;
	char statusAluno;
	boolean aprovado;
	String nomeAluno;
	
	nomeAluno = "Ana Paula da Silva Couto";
	statusAluno = 'M'; //Matriculado
	
	nota1 = 20;
	nota2 = 20;
	nota3 = 30;
	nota4 = 5;
	
	frequencia = 0.80;
	
	totalNotas = nota1 + nota2 + nota3 +nota4;
	
	aprovado = totalNotas >= 70 && frequencia >= 0.75;
	//Coloca 2%% na frente para ele nao entender como coringa
	System.out.printf("O(a) aluno(a) %s obteve nota final %.2f e frequencia %.2f%%. A situação do(a) aluno(a) é %c.\n"
			+ "Aluno aprovado? %b", nomeAluno, totalNotas, frequencia*100,statusAluno, aprovado);
	
	frequencia = 0.60;
	
	totalNotas = nota1 + nota2 + nota3 +nota4;
	
	aprovado = totalNotas >= 70 && frequencia >= 0.75;
	//Coloca 2%% na frente para ele nao entender como coringa
	System.out.printf("\nO(a) aluno(a) %s obteve nota final %.2f e frequencia %.2f%%. A situação do(a) aluno(a) é %c.\n"
			+ "Aluno aprovado? %b", nomeAluno, totalNotas, frequencia*100,statusAluno, aprovado);
		
	nota1 = 20;
	nota2 = 20;
	nota3 = 10;
	nota4 = 5;
	frequencia = 0.80;
	
	totalNotas = nota1 + nota2 + nota3 +nota4;
	
	aprovado = totalNotas >= 70 && frequencia >= 0.75;
	//Coloca 2%% na frente para ele nao entender como coringa
	System.out.printf("\nO(a) aluno(a) %s obteve nota final %.2f e frequencia %.2f%%. A situação do(a) aluno(a) é %c.\n"
			+ "Aluno aprovado? %b", nomeAluno, totalNotas, frequencia*100,statusAluno, aprovado);
		
		
	}

}
