package pacotePraticaIntegradora;

import java.util.*;
import java.math.*;
import java.io.*;


public class PraticaIntegradora {
//1- vai criar um MENU no programa que vai ficar repetindo e perguntando ao usuario o que ele quer fazer
//2- cria um CHAR vazio
//3 - faz um DO WHILE para que o menu seja mostrado ao menos uma vez para o usario, nem que seja para ele sair 
//> Equanto a operacao for diferente de S ele vai ficar repetindo
//4- faz o System para dar uma mensangem para o usuario 
//5- Depois de exibir o menu para o usuário, vamos coletar a operacao dele, atraves do Scanner	
//6- Para entender o que o usuario quer, vamos usar o switch
//7- Coloca o case para os casos da operacao do menu de opcoes
//8- o D é para digitar nosvos numeros, ai tem que criar um VETOR de numeros, pq como ainda nao aprendemos LISTAS vai ter que ser VETOR,
	//não é uma boa pratica para esse codigo mas só para aprender
//9- precisa coletar os números, faz SYSTEM para usuarios digiar numeros e salva em NUMEROS[I]
//10- tem que incrementar o i I++ cada vez que o usuarios digitar o numero
//11- tem que finalizar com o BREAK
//12- nao esquercer de declarar o i INT I = 0
//13- para o case Z da somatoria dos numeros faz um FOR e coloca uma variavel J para controlar o FOR e J<I porque I é a quantidade de 
	//numeros que já foi digitado, entao enquanto J for menor que I vai somando, J++ > Nao esquecer de {}
	// vai ter uma variavel chamada somatorio para somar os numeros de J nao esquecer de declarar SOMATORIO
//14-System para dar o resultadado do SOMATORIO e BREAK
//15- V para exibir os numeros digitados: faz o mesmo FOR de somatorio, e exibe com o SYSTEM numeros[j]
//16- P quantidade de numeros digitados: o I guarda eles só que deveria ser i - 1 
	//> PQ I guarda sempre a próxima posiçao do vertor que está vazia e quero só até onde está cheio, 
	//mas como i começa em 0 ai tem que exibir i mesmo para dar certo.
//17- M declarar uma variavel media que é DOUBLE pq vai ter divisao > media NAO pode ser a variaveel SOMATORIO
	//pq se nao tiver passado pelo somatorio que é digitado a opcao s vai dar 0
	//> assim, para somar todo mundo tem que digitar o codigo do FOR DO SOMATARIO, depois: media = somatorio / (i);
//18- Q quantidade de pares: tem que percorrer a lista de novo com o FOR do J, depois fazer um IF para numeros pares
	//> if (numeros[j] %2 == 0) siginifica que é par ai faz um contador: CONTAPARES contaPares = contapares +1; DECLARAR o CONTAPARES
//19- case S é a saida, entao só por o break pq ele estada no DO WHILE, entao apos o break DEFAULT	
	
	public static void main(String[] args) {
		Scanner entCaractere = new Scanner(System.in);
		Scanner entNumeros = new Scanner(System.in);
		char operacao = ' ';
		int[] numeros = new int [1000];
		int i = 0, j = 0, somatorio = 0, contaPares = 0;
		double media = 0;
		
		do {
			System.out.printf("Menu de opções. \n"
					+ "D - para digitar novos números.\n"
					+ "S - apresentar o somatorio dos números. \n"
					+ "V - para visualizar todos os números digitados. \n"
					+ "P - para a quantidade de números digitados. \n"
					+ "M - para a média simples dos números digitados. \n"
					+ "Q - para a quantidade de pares. \n"
					+ "S - para sair do programa.");			
			operacao = entCaractere.nextLine().charAt(0);
			
			switch(operacao) {
				case 'D' : 
					System.out.println("Digite o número desejado: ");
					numeros[i] = entNumeros.nextInt();
					i++;
					break;
				case 'Z' :
					for (j = 0; j < i; j++){
					somatorio = somatorio + numeros[j];
					}
					System.out.printf("O somatório dos números é: %d\n", somatorio);
					break;
				case 'V' :
					for (j = 0; j < i; j++){
						
					System.out.printf("%d\n", numeros[j]);
					}
					break;
				case 'P':
					System.out.printf("Foram digitados %d números. \n", i);
					break;
				case 'M' :
					for (j = 0; j < i; j++){
						somatorio = somatorio + numeros[j];
					}
					media = somatorio / (i);
					System.out.printf("A média dos númeres é: %.2f.\n", media);
					break;
				case 'Q' :
					for (j = 0; j < i; j++){
						if (numeros[j] %2 == 0)
							contaPares = contaPares +1;
					}
					System.out.printf("Quantidade de números pares é %d.\n", contaPares);
					break;
				case 'S' :
					break;
					default:
						System.out.printf("Saída do programa.");	
			}
			
			
		} while (operacao != 'S');
		
		System.out.println("Fim da execução.");
		
		
		
		
		

	}

}
