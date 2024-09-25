package pacoteTratamentoArquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TratamentoArquivo {

	public static void main(String[] args) {
		
		try {
			  FileReader arquivo = new FileReader("/Users/thaismoreira/DadosAulaLeituradeDados.txt");
			  BufferedReader lerArquivo = new BufferedReader(arquivo);
			
			  String linha;
			  linha = lerArquivo.readLine();
			  
			  
			  
			  while (linha != null) {
				  String[] dadosCliente = new String[4];
				  dadosCliente = linha.split(";");
				  //1; Paulo Campos; Rua a, 32; BH onde tem ; vai ser quebrado em capos de vetor

				  System.out.printf("Código co cliente: %s.\n"
				  					+ "Nome do cliente: %s.\n"
				  					+ "Endereço: %s.\n"
				  					+ "Cidade: %s.\n"
				  					+ "Estado civil: %s.\n", dadosCliente[0], dadosCliente[1],
				  					dadosCliente[2], dadosCliente[3], dadosCliente[4]);
				  
				 // System.out.printf("%s\n", linha);
				  linha = lerArquivo.readLine();
				  System.out.println(""); //para dar um espaço de linha entre clientes
			  }
			  lerArquivo.close();
			  arquivo.close();
			
		} catch (IOException e){
			System.out.println("Erro lendo dados: " + e.getMessage());
			
		}
		
		
	
		
	}

}
