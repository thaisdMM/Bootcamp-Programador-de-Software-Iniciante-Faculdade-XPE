package pacoteGravacaoArquivos;

import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.*;

public class GravacaoArquivos {

	public static void main(String[] args) {
		
		try {
			FileWriter arquivo = new FileWriter("/Users/thaismoreira/SaidaDados.txt");
			PrintWriter gravarArquivo = new PrintWriter(arquivo);
			
			for(int i = 0; i < 1000; i++) {
				gravarArquivo.printf("valor de i: %d.%n", i);// esse %n é para quebrar as linhas do arquivo
			}
			
			gravarArquivo.close();
			arquivo.close();
			
		}
		 catch (IOException e){
			System.out.println("Ocorreu um erro ao gravar o arquivo: " + e.getMessage());
		}
		System.out.println("Fim da execução.");
		
	}

}
