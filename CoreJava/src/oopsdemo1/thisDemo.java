package oopsdemo1;

import java.util.concurrent.ForkJoinPool.ManagedBlocker;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 26, 2024
 * Time   :12:39:45 PM
 * email  :Koppula.Reddy@coforge.com
 */

public class thisDemo {
	private int number;
	private String text;

	//Default Constructor - 
	//Compiler Creates it for Automatic initialization of Object Properties

	//This keyword refers to Current Object calling the Method

	public void setValues(int number,String text) {
		this.number=number;
		this.text=text;
	}
	public void display() {
		System.out.println("Number : "+this.number);
		System.out.println("Text   : "+this.text);
	}

	public static void main(String[] args) {
		thisDemo demo1=new thisDemo();
		thisDemo demo2=new thisDemo();

		demo1.setValues(100, "Java Programming"); //Method call
		demo2.setValues(200, "Spring Programming");//Method call

		demo1.display();
		demo2.display();

	}

}
