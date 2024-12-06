package oopsDemo2;

/**
* Author :Koppula.Reddy
* Date   :Oct 28, 2024
* Time   :12:12:39 PM
* email  :Koppula.Reddy@coforge.com
*/

public class AccountTransaction extends SavingsAccount{
	
	private double withdrawal,deposit,finalBalance;

	public AccountTransaction(int accountNumber, String name, float minimumBalance, double balance,double withdrawal
		,double deposite) {
		super(accountNumber, name, minimumBalance, balance);
		this.withdrawal=withdrawal;
		this.deposit=deposite;

		
	}
	public void display()
    {
        super.display();
        System.out.println("Deposit Amount    : "+deposit);
        System.out.println("Withdrawal Amount : "+withdrawal);
        finalBalance=(balance+deposit)-withdrawal;
        System.out.println("Final Balance     : "+finalBalance);
    }
	
	

}
