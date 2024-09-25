package pacoteAulaSwitch;
import java.math.*;
import java.util.*;

public class AulaSwitch {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		char operacao = ' ';
		
		double n1 = 0, n2 = 0, total = 0;
		
		System.out.println("Digite o valor do primeiro número: ");
		n1 = ent.nextInt();
		
		System.out.println("Digite o valor do segundo número: ");
		n2 = ent.nextInt();
		
		ent.nextLine();
		
		System.out.println("Digite a operação desejada (+, -, /, *, %)");
		operacao = ent.nextLine().charAt(0);
		
		switch(operacao) {
			case '+':
				total = n1 + n2;
				break;
			case '-':
				total = n1 - n2;
				break;
			case '/':
				total = n1 / n2;
				break;
			case '*':
				total = n1 * n2;
				break;
			case '%':
				total = n1 % n2;
				break;
			default: //caso nao entre em nenhum dos casos acima
				System.out.println("Operação desconhecida.");
		
		}
		if (operacao == '+' || operacao == '-' || operacao == '/' || operacao == '*' || operacao == '%')
			System.out.printf("%.2f %c %.2f = %.2f", n1, operacao, n2, total);

	}

}
