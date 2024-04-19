package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");

		System.out.print("Number: ");
		int number = sc.nextInt();

		sc.nextLine();
		System.out.print("Holder: ");
		String name = sc.nextLine();

		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();

		System.out.print("Withdraw limit: ");
		double witchdrawLimit = sc.nextDouble();

		Account ac = new Account(number, name, balance, witchdrawLimit);

		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double withdrawAmount = sc.nextDouble();
		ac.withdraw(withdrawAmount);
		
		
		if(withdrawAmount > witchdrawLimit) {
			System.out.println("Withdraw error: The amount exceeds witdraw limit");
		}else if(withdrawAmount > balance) {
			System.out.println("Withdraw error: Not enough balance");
		}else {
			System.out.println("New balance: " + ac.getBalance());
			
		}

		sc.close();
	}

}
