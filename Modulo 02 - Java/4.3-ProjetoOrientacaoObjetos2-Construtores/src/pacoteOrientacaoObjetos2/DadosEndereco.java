package pacoteOrientacaoObjetos2;

public class DadosEndereco {
	
	String logradouro;
	int numero;
	String complemento;
	String cidade;
	String estado;
	String CEP; // nao coloca inteiro pq se o cep começar com 0 nao vai armazenar
	
	String imprimirDadosEndereco() {
		return "Rua " + logradouro + ", " + Integer.toString(numero) + ", " + complemento + ". Cidade: " 
				+ ". Estado: " + estado + ". CEP: " + CEP;
		
	}
	

}
