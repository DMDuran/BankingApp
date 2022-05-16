import java.util.Scanner;

/**
 * 
 */

/**
 * @author marcoduran
 *
 */
public class BankingApplication {

	/*
	 * Create classes that will perform functions for the main method Deposit,
	 * withdraw, show previous transactions
	 */

	public static void main(String[] args) {

	}

	// Class for BankAccount
	class BankAccount {
		// Declaring and Initializing variables
		int balance;
		int previousTransaction;
		String customerName;
		String customerId;

		// Creating first method that will perform deposit functions
		void deposit(int amount) {
			if (amount != 0) // Condition will run if amount given is not 0
			{
				balance = balance + amount; // Adding amount user gave to account balance
				previousTransaction = amount; // Initialzing previousTransaction to match amount
			}
		}

		// Creating method that will perform a withdraw functions
		void withdraw(int amount) {
			if (amount != 0) // Condition will run if amount given is not 0
			{
				balance = balance - amount; // Subtracting amount user gave to account balance
				previousTransaction = -amount; // Initialzing previousTransaction to match amount wtih -
			}
		}

		// Creating method that will perform a print for previous transaction
		void getPreviousTransaction() {
			if (previousTransaction > 0) // If condition to check if there was a postive amount
			{
				System.out.println("Deposited: " + previousTransaction); // If positive, print amount
			} else if (previousTransaction < 0) // Else if condition to check if there was a negative amount
			{
				System.out.println("Withdraw: " + Math.abs(previousTransaction)); // If negative, print amount.  Math.abs does not show negative

			} else // Else condition will happen if no previousTransaction has been made
			{
				System.out.println("No transaction occured.");
			}
		}
		
		void showMenu()
		{
			
		}
	}
}
