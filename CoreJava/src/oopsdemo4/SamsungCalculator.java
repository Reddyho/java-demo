package oopsdemo4;

import java.util.Scanner;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 30, 2024
 * Time   :12:32:22 PM
 * email  :Koppula.Reddy@coforge.com
 * 
 * Program to design calculator from Interface
 */

public class SamsungCalculator implements ICalculator {

	Scanner kb;
	@Override
	public void add() {
		kb = new Scanner(System.in);
		System.out.println("Enter any two integer values to perform addition");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+s);				
	}

	@Override
	public void sub() {
		kb = new Scanner(System.in);
		System.out.println("Enter any two integer values to perform sub");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a-b;
		System.out.println("Sub of "+a+" and "+b+" is "+s);	

	}

	@Override
	public void mul() {

		kb = new Scanner(System.in);
		System.out.println("Enter any two integer values to perform mul");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a*b;
		System.out.println("mul of "+a+" and "+b+" is "+s);	
	}

	@Override
	public void div() {

		kb = new Scanner(System.in);
		System.out.println("Enter any two integer values to perform div");
		int a=kb.nextInt();
		int b=kb.nextInt();
		float s=(float)a/b;
		System.out.println("div of "+a+" and "+b+" is "+s);	
	}
	public void display() {
		System.out.println("make by honey");
		
	}


}
