package oopsDemo2;

/**
* Author :Koppula.Reddy
* Date   :Oct 28, 2024
* Time   :12:03:30 PM
* email  :Koppula.Reddy@coforge.com
*/

//account -->Savings account-->accountTransaction
public class Account {
	private int accountNumber;
    private String name;
    
    
	public Account(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}
    
	 public void display() {
	        System.out.println("********** Account Details ***********");
	        System.out.println("Account Number : "+accountNumber);
	        System.out.println("Customer Name  :"+name);
	    }

}
