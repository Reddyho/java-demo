package assignment;

import java.util.Scanner;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 27, 2024
 * Time   :4:42:55 PM
 * email  :Koppula.Reddy@coforge.com
 */

public class BankAccount {

	private long accountNo;
	private String name;
	private double balance,amount;
	private String choice;

	Scanner sc=new Scanner(System.in);

	public void input() {
		System.out.println("enter the account holder name:");
		name=sc.nextLine();
		System.out.println("enter the account number:");
		accountNo=sc.nextLong();
		System.out.println("intial Balance:");
		balance=sc.nextDouble();
		System.out.println("deposite or withdrawl:");
		choice=sc.next();
		System.out.println("enter the amount:");
		amount=sc.nextDouble();

	}
	public void makechoice() {
		if(choice.equalsIgnoreCase("deposite")) {
			balance+=amount;
			System.out.println("deposited ammount is:"+amount);
			System.out.println("balance is:"+balance);

		}
		else if(choice.equalsIgnoreCase("withdrawl")) {
			if(balance>=amount) {
				balance-=amount;
				System.out.println("withdrawl ammount is:"+amount);
				System.out.println("balance is:"+balance);
			}
			else {
				System.out.println("insufficient balance");
			}
		}
		else {
			System.out.println("invalid choice");
		}
	}


}
