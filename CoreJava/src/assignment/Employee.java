package assignment;

import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Oct 27, 2024
* Time   :4:20:34 PM
* email  :Koppula.Reddy@coforge.com
*/

public class Employee {
	
	private double salary;
	private int hrs;
	
	Scanner sc=new Scanner(System.in);
	
	public void getInfo() {
		System.out.println("Enter the salary and hours of work:");
	    salary=sc.nextDouble();
	    hrs=sc.nextInt();
	}
	
	public void addSal() {
		if(salary<500) {
			salary+=10;
		}
		
	}
	public void addWork() {
		if(hrs>6) {
			salary+=5;
		}
		
	}
	public void display() {
		System.out.println("final salary is"+salary);
		
	}

}
