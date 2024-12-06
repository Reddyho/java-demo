package exceptiondemo;

/**
* Author :Koppula.Reddy
* Date   :Nov 6, 2024
* Time   :4:41:02 PM
* email  :Koppula.Reddy@coforge.com
*/

public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    //Method might throw custom Exception InSufficientFundsException
    public void withdraw(double amount) throws InsufficentFundsException {
        if (amount > balance) {
            throw new InsufficentFundsException("Insufficient funds for withdrawal.");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

}
