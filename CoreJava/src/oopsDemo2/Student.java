package oopsDemo2;

/**
* Author :Koppula.Reddy
* Date   :Oct 29, 2024
* Time   :9:54:59 AM
* email  :Koppula.Reddy@coforge.com
* 
* program to demonstrate aggregation-student class with address object-hasa-a relationship
*/

public class Student {
	
	private int rollNo;
	private String name;
	
	private Address ad;

	public Student(int rollNo, String name, Address ad) {
		this.rollNo = rollNo;
		this.name = name;
		this.ad = ad;
	}
	
	void display() {
		System.out.println("----------Student Details------------");
		System.out.println("Student Id    :"+rollNo);
		System.out.println("Student Name  :"+name);
		System.out.println("Address       :"+ad.city+" "+ad.state+" "+ad.country+" "+ad.pincode);
	}

}
