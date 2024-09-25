package pacotePrincipalOrientacaoObjetos;

import java.util.*;

public class PrincipalAula0rientacaoObjetos {

	public static void main(String[] args) {
		
		//SCANNER é classe; ENT: é o objeto; NEW: é como se ele desse vida ao objeto entrada... 
		//>agora vai "criar" uma pessoa com as mesmas terminologias do SCANNER observe que tem os mesmos traços
		Scanner ent = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa();
		p1.nome = "João Nascimento";
		p1.idade = 25;
		p1.altura = 1.80;
		p1.peso = 70;
		
		System.out.printf("%s\nAno de Nascimento: %d\n", p1.imprimirDados(), p1.retornarAnoNascimento());
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Ana Carvalho";
		p2.idade = 40;
		p2.altura = 1.89;
		p2.peso = 76;
		
		System.out.printf("\n%s\nAno de Nascimento. %d\n", p2.imprimirDados(), p2.retornarAnoNascimento());
		
		
		
		
	}

}
