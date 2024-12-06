package oopsDemo3;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 29, 2024
 * Time   :3:44:08 PM
 * email  :Koppula.Reddy@coforge.com
 */
//class for CheckingAccount operations - 
//It is a Account with different implementation of Withdraw
//It has extra feature - OverDraft (Pre-sanctioned Loan)

public class CheckingAccount extends Account {

	private double overDraft;

	public CheckingAccount(String name, double balance,double overDraft) {
		super(name, balance);
		this.overDraft=overDraft;
	}

	@Override
	public void withdraw(double amt) {
		super.withdraw(amt);
		System.out.println("Overdraft Amount: " + overDraft);
		if (amt <= balance) {
			balance -= amt;
			System.out.println("Withdrawing: " + amt);
		} else if ((amt > balance) && (amt > (balance + overDraft))) {
			System.out.println("Sorry! You cannot withdraw");
		} else {
			double result = amt - balance;
			overDraft -= result;
			balance = 0;

			System.out.println("Withdrawing: " + amt);
			System.out.println("Current Overdraft Amount: "
					+ overDraft);
		}
	}





}
