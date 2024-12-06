package java8features;

/**
* Author :Koppula.Reddy
* Date   :Nov 8, 2024
* Time   :2:53:10 PM
* email  :Koppula.Reddy@coforge.com
*/

public class Student {
	
	Integer rollNumber;
	String name;
	Double marks;
	
	
	public Student(Integer rollNumber, String name, double marks) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}


	public Integer getRollNumber() {
		return rollNumber;
	}


	public String getName() {
		return name;
	}


	public Double getMarks() {
		return marks;
	}
	
	
	

}
