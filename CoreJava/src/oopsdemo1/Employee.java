package oopsdemo1;

import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Oct 26, 2024
* Time   :10:47:50 AM
* email  :Koppula.Reddy@coforge.com
*/

public class Employee {


	private int empId;
	private String firstName,lastName,desig;
	private double basic,har,da,grossSalary,netSalary;
	private static final double TAX=1000; //constant decliration
	
	Scanner sc=new Scanner(System.in);
	
	//defualt constantor -
	//compalier creates for its atomatic inisilaization of object
	
	//define method
	
	public void inputEmployeeDetails() {
		System.out.println("enter employee id,first name,last name&desig");
		empId=sc.nextInt();
		firstName=sc.next();
		lastName=sc.next();
	    desig=sc.next();
	    System.out.println("enter basic salary of employee:");
	    basic=sc.nextDouble();
	    
	}
	
	public void calaculateNet() {
		har=basic*0.25;
		da=basic*0.15;
		grossSalary=basic+har+da;
		netSalary=grossSalary-TAX;
		
	}
	
	public void displayEmployeeDetails() {
		System.out.println("**********employee Salary Slip*********");
		System.out.println("employee id    :"+empId);
		System.out.println("employee id      :"+empId);
		System.out.println("Name             :"+firstName+" "+lastName);
		System.out.println("Designitaion     :"+desig);
		System.out.println("Basic            :"+basic);
		System.out.println("HRA              :"+har);
		System.out.println("Dearness Alllow  :"+da);
		System.out.println("gross salary is  :"+grossSalary);
		System.out.println("TAX              :"+TAX);
		System.out.println("---------------------------------");
		System.out.println("Net Salary is    :"+netSalary);
		System.out.println("---------------------------------");
		
	}
	

	}


