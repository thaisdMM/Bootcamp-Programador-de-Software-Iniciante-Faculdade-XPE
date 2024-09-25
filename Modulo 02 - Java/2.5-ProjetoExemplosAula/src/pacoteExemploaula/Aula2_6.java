package pacoteExemploString;

public class Aula2_6 {

	public static void main(String[] args) {
	
		String nome, nome2;
		nome = "José da Silva Costa";
		nome2 = "Maria Clara Souza Almeida";
		
		System.out.println(nome);
		System.out.println(nome2);
		
		int tamanhoDoNome = nome.length() , tamanhoDoNome2 = nome2.length();
		
		System.out.println("A variável nome tem " + tamanhoDoNome + " caracteres.");
		System.out.println("A variável nome2 tem " + tamanhoDoNome2 + "caracteres" );
		int totalCaracteres = tamanhoDoNome + tamanhoDoNome2;
		System.out.println("O total de caracteres das duas variaveis é : " + totalCaracteres);
		
		String nomesConcatenados = nome.concat(nome2);
		System.out.println(nomesConcatenados);
		
		String nomeSemA = nome.replace('a' , '9');
		System.out.println(nomeSemA);
		
		String somenteNome = nome2.substring(0, 11);
		System.out.println(somenteNome);
		
		String nomeTudoMaiusculo = nome.toUpperCase();
		System.out.println(nomeTudoMaiusculo);
		
		String nomeTudoMinusculo = nome.toLowerCase();
		System.out.println(nomeTudoMinusculo);
		
		char teste = 'C'; 
		

	}

}
