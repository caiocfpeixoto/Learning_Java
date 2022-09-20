package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Enter account number: ");
		int numero_conta =sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome_titular = sc.next();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposito_inicial = sc.nextDouble();
			conta = new Conta(numero_conta,nome_titular,deposito_inicial);
		}
		else{
			conta = new Conta(numero_conta,nome_titular);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.print(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposito_inicial = sc.nextDouble();
		conta.depositar(deposito_inicial);
		
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double valor_saque = sc.nextDouble();
		conta.saque(valor_saque);
		
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		sc.close();

	}

}
