package pacoteAula2_11OperadoresLogicos;

public class Aula2_12OperadoresLogicosPratica {

	public static void main(String[] args) {
		
		boolean ult3EmprestQuitadosPrazo, possuiRendaComprovada, clienteDezEstreslas, restricaoCredito;
		
		ult3EmprestQuitadosPrazo = false;
		possuiRendaComprovada = false;
		clienteDezEstreslas = true;
		//Precedencia ! && ||
		boolean concederEmprestimo = ult3EmprestQuitadosPrazo && possuiRendaComprovada || clienteDezEstreslas;
		System.out.printf("OU : 1 lado TRUE: Empréstimo concedido? \n%b", concederEmprestimo);
		
		ult3EmprestQuitadosPrazo = false;
		possuiRendaComprovada = false;
		clienteDezEstreslas = false;
		//Precedencia ! && ||
		concederEmprestimo = ult3EmprestQuitadosPrazo && possuiRendaComprovada || clienteDezEstreslas;
		System.out.printf("\nOU: 2 lados False: Empréstimo concedido? \n%b", concederEmprestimo);
		
		ult3EmprestQuitadosPrazo = true;
		possuiRendaComprovada = false;
		clienteDezEstreslas = false;
		//Precedencia ! && ||
		concederEmprestimo = ult3EmprestQuitadosPrazo && possuiRendaComprovada || clienteDezEstreslas;
		System.out.printf("\nOU: 1 lado falso E precedencia && true e falso: Empréstimo concedido? \n%b", concederEmprestimo);
		
		ult3EmprestQuitadosPrazo = true;
		possuiRendaComprovada = true;
		clienteDezEstreslas = false;
		//Precedencia ! && ||
		concederEmprestimo = ult3EmprestQuitadosPrazo && possuiRendaComprovada || clienteDezEstreslas;
		System.out.printf("\nOU : 1 lado TRUE: Empréstimo concedido? \n%b", concederEmprestimo);
		
		ult3EmprestQuitadosPrazo = true;
		possuiRendaComprovada = false;
		clienteDezEstreslas = false;
		restricaoCredito = false; //melhor dar falso pq é importante nao ter restricao de credito
		//Precedencia ! && ||
		concederEmprestimo = (ult3EmprestQuitadosPrazo && possuiRendaComprovada || clienteDezEstreslas) && !restricaoCredito;
		System.out.printf("\n&&||&& Empréstimo concedido? \n%b", concederEmprestimo);
		
		ult3EmprestQuitadosPrazo = true;
		possuiRendaComprovada = false;
		clienteDezEstreslas = false;
		restricaoCredito = true; //melhor dar falso pq é importante nao ter restricao de credito
		//Precedencia ! && ||
		concederEmprestimo = (ult3EmprestQuitadosPrazo && possuiRendaComprovada || clienteDezEstreslas) && !restricaoCredito;
		System.out.printf("\n&&||&& Empréstimo concedido? \n%b", concederEmprestimo);
		
		ult3EmprestQuitadosPrazo = true;
		possuiRendaComprovada = true;
		clienteDezEstreslas = false;
		restricaoCredito = true; //melhor dar falso pq é importante nao ter restricao de credito
		//Precedencia ! && ||
		concederEmprestimo = (ult3EmprestQuitadosPrazo && possuiRendaComprovada || clienteDezEstreslas) && !restricaoCredito;
		System.out.printf("\n&&||&& Empréstimo concedido? \n%b", concederEmprestimo);
		
		ult3EmprestQuitadosPrazo = true;
		possuiRendaComprovada = true;
		clienteDezEstreslas = true;
		restricaoCredito = true; //melhor dar falso pq é importante nao ter restricao de credito
		//Precedencia ! && ||
		concederEmprestimo = (ult3EmprestQuitadosPrazo && possuiRendaComprovada || clienteDezEstreslas) && !restricaoCredito;
		System.out.printf("\n&&||&& Empréstimo concedido? \n%b", concederEmprestimo);
		
		ult3EmprestQuitadosPrazo = true;
		possuiRendaComprovada = true;
		clienteDezEstreslas = true;
		restricaoCredito = false; //melhor dar falso pq é importante nao ter restricao de credito
		//Precedencia ! && ||
		concederEmprestimo = (ult3EmprestQuitadosPrazo && possuiRendaComprovada || clienteDezEstreslas) && !restricaoCredito;
		System.out.printf("\n&&||&& Empréstimo concedido? \n%b", concederEmprestimo);
		
		ult3EmprestQuitadosPrazo = true;
		possuiRendaComprovada = true;
		clienteDezEstreslas = false;
		restricaoCredito = false; //melhor dar falso pq é importante nao ter restricao de credito
		//Precedencia ! && ||
		concederEmprestimo = (ult3EmprestQuitadosPrazo && possuiRendaComprovada || clienteDezEstreslas) && !restricaoCredito;
		System.out.printf("\n&&||&& Empréstimo concedido? \n%b", concederEmprestimo);
		
		ult3EmprestQuitadosPrazo = true;
		possuiRendaComprovada = false;
		clienteDezEstreslas = false;
		restricaoCredito = false; //melhor dar falso pq é importante nao ter restricao de credito
		//Precedencia ! && ||
		concederEmprestimo = (ult3EmprestQuitadosPrazo && possuiRendaComprovada || clienteDezEstreslas) && !restricaoCredito;
		System.out.printf("\n&&||&& Empréstimo concedido? \n%b", concederEmprestimo);
		
		ult3EmprestQuitadosPrazo = false;
		possuiRendaComprovada = false;
		clienteDezEstreslas = false;
		restricaoCredito = false; //melhor dar falso pq é importante nao ter restricao de credito
		//Precedencia ! && ||
		concederEmprestimo = (ult3EmprestQuitadosPrazo && possuiRendaComprovada || clienteDezEstreslas) && !restricaoCredito;
		System.out.printf("\n&&||&& Empréstimo concedido? \n%b", concederEmprestimo);
		
		ult3EmprestQuitadosPrazo = false;
		possuiRendaComprovada = false;
		clienteDezEstreslas = true;
		restricaoCredito = false; //melhor dar falso pq é importante nao ter restricao de credito
		//Precedencia ! && ||
		concederEmprestimo = (ult3EmprestQuitadosPrazo && possuiRendaComprovada || clienteDezEstreslas) && !restricaoCredito;
		System.out.printf("\n&&||&& Empréstimo concedido? \n%b", concederEmprestimo);
		
		ult3EmprestQuitadosPrazo = false;
		possuiRendaComprovada = true;
		clienteDezEstreslas = false;
		restricaoCredito = false; //melhor dar falso pq é importante nao ter restricao de credito
		//Precedencia ! && ||
		concederEmprestimo = (ult3EmprestQuitadosPrazo && possuiRendaComprovada || clienteDezEstreslas) && !restricaoCredito;
		System.out.printf("\n&&||&& Empréstimo concedido? \n%b", concederEmprestimo);
		
		
		
		
	}

}
