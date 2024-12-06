package oopsDemo2;

/**
* Author :Koppula.Reddy
* Date   :Oct 28, 2024
* Time   :12:06:40 PM
* email  :Koppula.Reddy@coforge.com
*/

public class SavingsAccount extends Account {
	private float minimumBalance;
	protected double balance;

	public SavingsAccount(int accountNumber, String name,float minimumBalance,double balance) {
		super(accountNumber, name);
		this.minimumBalance=minimumBalance;
		this.balance=balance;
	}
	
	public void display() {
		super.display();
		System.out.println("minimum balance   :"+minimumBalance);
		System.out.println("balance           :"+balance);
		
	}
	

}
