package oopsDemo3;

/**
* Author :Koppula.Reddy
* Date   :Oct 29, 2024
* Time   :4:58:57 PM
* email  :Koppula.Reddy@coforge.com
*/

public class Student {
	private int rollNo;
	private String name;
	
	private static  String organization="VTU";

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	
	
	public static void organizationChange() {
		organization="coforge";
		
	}
	public void display() {
		System.out.println(this.rollNo+" "+this.name+" "+organization);
		
	}
		
	

}
