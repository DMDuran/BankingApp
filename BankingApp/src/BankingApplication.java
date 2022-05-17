import java.text.DecimalFormat;
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
	 * Create classes that will perform functions for the main method deposit,
	 * withdraw, show previous transactions, display a welcome message, and a show
	 * menu.
	 */

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in); // Creating scanner for user input

		// Declaring and Initializing Variables
		String customerName;
		String customerId;

		System.out.print("Please enter your first name: "); // Asking user to enter first name
		customerName = scn.next();
		System.out.print("Please enter your login ID, no spaces please: "); // Asking user to enter login ID
		customerId = scn.next();

		System.out.println(); // Line Break

		// Calling constructor
		BankAccount obj1 = new BankAccount(customerName, customerId);
		obj1.showMenu();

		// BankAccount obj1 = new BankAccount("okthenwhat", "okok123");
		// obj1.showMenu();

		scn.close(); // Closing scanner
	}
}

// Class for BankAccount
class BankAccount {
	// Declaring and Initializing variables
	double balance;
	double previousTransaction;
	String customerName;
	String customerId;

	// Creating a constructor to display welcome message
	BankAccount(String cname, String cid) {
		customerName = cname;
		customerId = cid;
	}

	// Creating method that will perform deposit functions
	void deposit(double amount) {
		if (amount != 0) // Condition will run if amount given is not 0
		{
			balance = balance + amount; // Adding amount user gave to account balance
			previousTransaction = amount; // Initializing previousTransaction to match amount
		}
	}

	// Creating method that will perform a withdraw functions
	void withdraw(double amount) {
		if (amount != 0) // Condition will run if amount given is not 0
		{
			balance = balance - amount; // Subtracting amount user gave to account balance
			previousTransaction = -amount; // Initializing previousTransaction to match amount wtih -
		}
	}

	// Creating method that will perform a print for previous transaction
	void getPreviousTransaction() {
		DecimalFormat df = new DecimalFormat("#.##"); //Creating decimal format to get #.##
		if (previousTransaction > 0) // If condition to check if there was a postive amount
		{
			System.out.println("Deposited: $" + df.format(previousTransaction)); // If positive, print amount
		} else if (previousTransaction < 0) // Else if condition to check if there was a negative amount
		{
			System.out.println("Withdrawn: $" + df.format(Math.abs(previousTransaction))); // If negative, print amount. Math.abs
																				// does not show negative

		} else // Else condition will happen if no previousTransaction has been made
		{
			System.out.println("No transaction occured.");
		}
	}

	// Show menu will display options for the user and allow him/her to navigate the
	// screen
	void showMenu() {

		char option = '\0'; // Initializing this values with any value
		Scanner scn = new Scanner(System.in); // Creating scanner

		System.out.println("Welcome " + customerName);
		System.out.println("Your ID is " + customerId);
		System.out.println(); // Line break

		// There print lines will be the options the user can access
		System.out.println("A. Check balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous transaction");
		System.out.println("E. Exit");

		// Performing a do while loop for customer options
		do {
			System.out.println("=========================================================================");
			System.out.print("Enter an option: "); // Prompting user input for which option
			option = scn.next().charAt(0); // Char varible will be used to get input
			System.out.println("=========================================================================");
			System.out.println(); // Line Break

			// Using a case switch loop so for options A, B, C, D, and E.
			switch (option) // Will read option char which was user input
			{
			case 'A': // This case will display balance of account
				DecimalFormat df = new DecimalFormat("#.##"); //Creating decimal format to get #.##
				System.out.println("------------------------------------------------------------------");
				System.out.println("Balance = $" + df.format(balance));
				System.out.println("------------------------------------------------------------------");
				System.out.println(); // Line Break
				break; // Breaking case

			case 'B': // This case will prompt user for input on how much they would like to deposit
				System.out.println("------------------------------------------------------------------");
				System.out.print("Enter amount you would like to deposit: ");
				double amount = scn.nextDouble(); // User scanner for amount
				System.out.println("------------------------------------------------------------------");
				deposit(amount); // Calling deposit method
				System.out.println("$" + amount + " has been deposited!");
				System.out.println(); // Line Break
				break; // Breaking case

			case 'C': // This will prompt user for input on how much they would like to withdraw
				System.out.println("------------------------------------------------------------------");
				System.out.print("Enter amount you would like to withdraw: ");
				System.out.println("------------------------------------------------------------------");
				double amountTwo = scn.nextDouble(); // User scanner for amount
				withdraw(amountTwo); // Calling withdraw method and printing
				System.out.println("$" + amountTwo + " has been withdrawn from your account!");
				System.out.println(); // Line Break
				break; // Breaking case

			case 'D': // This will print previous transaction by calling method
				System.out.println("------------------------------------------------------------------");
				getPreviousTransaction(); // Calling method to print
				System.out.println("------------------------------------------------------------------");
				break; // Line Break

			case 'E':
				System.out.println("*******************************************************************");
				break;

			default: // If no option was given within the A, B, C, D, E parameters then you will
						// recieve an error
				System.out.println("Invalid option!  Please enter again.");

			}
		} while (option != 'E'); // While condition. If E is selected the case switch loop will break
		System.out.println("Thank you for using our services!"); // Closing statement for app
		scn.close(); // Closing Scanner
	}

}
