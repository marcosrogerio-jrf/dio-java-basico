package desafio;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Desafio - Java Básico");
		System.out.println("===============================================");
		System.out.println("CONTA TERMINAL\n");
		
		System.out.print("Informe o número da conta: ");
		int numero = scanner.nextInt();
		
		System.out.print("Informe o número da agência: ");
		String agencia = scanner.next();
		
		System.out.print("Informe o nome do cliente: ");
		String nomeCliente = scanner.next();
		
		System.out.print("Informe o saldo: ");
		double saldo = scanner.nextDouble();
		
		
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
	}
}
