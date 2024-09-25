package pacotePrincipalOrientacaoObjetos;

public class Pessoa {
	
	int idade;
	double altura;
	double peso;
	String nome;

//MÉTODO de imprimir dados
	
	String imprimirDados() {//METODO, Integer.toString(idade) esse comando converte idade em string
		return "Nome: " + nome + " \nIdade: " + Integer.toString(idade) + "\nPeso: " + Double.toString(peso) 
				+ "\nAltura: " + Double.toString(altura);	
		
	
	}
//criando outro MÉTODO que retorna o ano do nascimento
	
	int retornarAnoNascimento() {
		return 2020 - idade;
	}

	//isso é só a CLASSE PESSOA, é por enquanto só abstraçao, não tem OBJETOS, Entratanto dessa classe pode criar N OBJETOS,
	//> os OBJETOS Serao criados na classe principal
	
	
}
