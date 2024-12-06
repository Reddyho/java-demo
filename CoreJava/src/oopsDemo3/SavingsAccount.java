package oopsDemo3;

/**
* Author :Koppula.Reddy
* Date   :Oct 29, 2024
* Time   :3:41:05 PM
* email  :Koppula.Reddy@coforge.com
*/

public class SavingsAccount extends Account {
	
	private double interestRate;

	public SavingsAccount(String name, double balance,double interestRate) {
		super(name, balance);
		this.interestRate=interestRate;
		
	}

	public double getInterestRate() {
		return interestRate;
	}
	
	

}
