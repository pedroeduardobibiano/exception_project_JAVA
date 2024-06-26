package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

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

		try {
			ac.withdraw(withdrawAmount);
			System.out.println("New balance: " + ac.getBalance());

		} catch (DomainException e) {
			System.out.println(e.getMessage());
		}catch (InputMismatchException e) {
			System.out.println("error type");
		}

		sc.close();
	}

}
