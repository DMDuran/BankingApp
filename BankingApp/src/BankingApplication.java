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
	 * Create classes that will perform functions for the main method
	 * Deposit, withdraw, 
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

	}
}
