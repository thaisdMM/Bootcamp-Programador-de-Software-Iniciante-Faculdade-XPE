package pacoteOrientacaoObjetos2;

public class Pessoa {
	
	String nome;
	int idade;
	String CPF;
	DadosEndereco endereco; //esse retorna tudo que está na classe DadosEndereco
	
//no codigo abaixo está criando um novo objeto pessoa vazio - o CONSTRUTOR da Pessoa nao recebe nada
	Pessoa(){
		endereco = new DadosEndereco();
		
	}
	//aqui abaixo ele vai fazer um CONTRUTOR que já recebe os dados por parametro
	
	Pessoa(String name, int age, String id){
		nome = name;
		idade = age;
		CPF = id;
		endereco = new DadosEndereco();
		
	}
	//Criando uma PESSOA 3
	Pessoa(String name, int age, String id, String street, 
			int number, String compl, String city, String UF, String code){
		nome = name;
		idade = age;
		CPF = id;
		endereco = new DadosEndereco();
		endereco.logradouro = street;
		endereco.numero = number;
		endereco.complemento = compl;
		endereco.cidade = city;
		endereco.estado = UF;
		endereco.CEP = code;
		
	}
	
	
	String imprimirDadosPessoa(char imprimirEndereco) {
		if (imprimirEndereco == 'N' || imprimirEndereco == 'n')
			return "Nome: " + nome + "\nIdade: " + Integer.toString(idade) + "\nCPF: " + CPF;	
		else
			return "Nome: " + nome + "\nIdade: " + Integer.toString(idade) + "\nCPF: " 
		+ CPF + "\n" + endereco.imprimirDadosEndereco();	
		
			
	
	}

}
