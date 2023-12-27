package aplication;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Account account = new Account();
		
		System.out.print("Enter account number: ");
		int number = input.nextInt();
		System.out.print("Enter account holder: ");
		input.nextLine();
		String holder = input.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)?");
		char resp = input.next().charAt(0);
		if (resp == 'y') {
			System.out.print("Enter initial deposit value: $");
			double initialDeposit = input.nextDouble();
			account.deposit(initialDeposit);
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.print("Enter a deposit value: $");
		double amount = input.nextDouble();
		account.deposit(amount);
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: $");
		amount = input.nextDouble();
		account.withdraw(amount);
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		input.close();

	}

}
