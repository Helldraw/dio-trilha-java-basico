import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String agencia, nomeCliente;
		int numeroConta;
		double saldo;
		
		System.out.println("Por favor, informe seu nome");
		nomeCliente = entrada.next();
		System.out.println("Por favor, informe sua agencia");
		agencia = entrada.next();
		System.out.println("Por favor, informe sua conta");
		numeroConta = entrada.nextInt();
		System.out.println("Por favor, o saldo que deseja depositar");
		saldo = entrada.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco sua agência é %s, conta %d"
				+ " e seu saldo %.2f já está disponivel para saque", nomeCliente, agencia, numeroConta, saldo);
	}

}
