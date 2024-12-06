package assignment;

import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Oct 27, 2024
* Time   :5:25:12 PM
* email  :Koppula.Reddy@coforge.com
*/

public class Student {

	private String name;
	private int year;
	private String address;
	
	
	
	public Student(String name, int year, String address) {
		this.name = name;
		this.year = year;
		this.address = address;
	}



	//Scanner sc=new Scanner(System.in);
	
	/**public void input() {
		System.out.println("enter the name:");
		name=sc.nextLine();
		System.out.println("enter the joining year");
		year=sc.nextInt();
		System.out.println("enter the address:");
		address=sc.nextLine();
		
	}
	**/
	public void display() {
		System.out.println(name+" "+year+" "+address);
		
	}
	
}
