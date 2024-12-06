package exceptiondemo;

/**
* Author :Koppula.Reddy
* Date   :Nov 6, 2024
* Time   :4:40:42 PM
* email  :Koppula.Reddy@coforge.com
* 
* 		Java program that demonstrates the use of a custom exception.
		 * This example involves a bank account system where a custom
		 * exception is used to handle insufficient funds.
*/

public class CustomException {
	public static void main(String[] args) {

		 BankAccount account = new BankAccount(500.00); //Initial Balance

		        System.out.println("Attempting to deposit $200:");
		        account.deposit(200.00);

		        System.out.println("\nAttempting to withdraw $800:");
		        try {
		            account.withdraw(800.00);
		        } catch (InsufficentFundsException e) {  //Catch Custom Exceptions
		            System.out.println("Exception caught: " + e);
		        }

		        System.out.println("\nAttempting to withdraw $300:");
		        try {
		            account.withdraw(300.00);
		        } catch (InsufficentFundsException e) {
		            System.out.println("Exception caught: " + e);
		        }

		        System.out.println("\nFinal Balance: " + account.getBalance());
	}

}
