package pacoteAula2_11OperadoresLogicos;

public class Aula2_11OperadoresLogicosAndOrNot {

	public static void main(String[] args) {
		//And(e)&& Or(ou)|| Not(nao)!
		//Precedencia ! && ||
		
		//&&
		

		//p = tenho dinheiro;
		//q = tenho roupa nova;
		//s = vou sair;
		//s = p && q;
		
		boolean p, q, s;
 		
		p = false; q = false;
		
		s = p && q;
		
		System.out.printf("&& p: %b; q: %b; s: %b\n", p, q, s);
		
		p = true; q = false;
		
		s = p && q;
		
		System.out.printf("&& p: %b; q: %b; s: %b\n", p, q, s);
		p = false; q = true;
		
		s = p && q;
		
		System.out.printf("&& p: %b; q: %b; s: %b\n", p, q, s);
		p = true; q = true;
		
		s = p && q;
		
		System.out.printf("&& p: %b; q: %b; s: %b\n", p, q, s);
		
		//Or ||
		
		p = false; q = false;
		
		s = p || q;
		
		System.out.printf("\n|| p: %b; q: %b; s: %b\n", p, q, s);
		
		p = true; q = false;
		
		s = p || q;
		
		System.out.printf("|| p: %b; q: %b; s: %b\n", p, q, s);
		p = false; q = true;
		
		s = p || q;
		
		System.out.printf("|| p: %b; q: %b; s: %b\n", p, q, s);
		p = true; q = true;
		
		s = p || q;
		
		System.out.printf("|| p: %b; q: %b; s: %b\n", p, q, s);
		
		//Not !
		
		p = true;
		s = !p;
		
		System.out.printf("\n! p: %b; s: %b\n", p, s);
		
		p = false;
		s = !p;
		
		System.out.printf("! p: %b; s: %b\n", p, s);
		
		
	}

}
