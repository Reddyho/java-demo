package oopsdemo1;

import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Oct 25, 2024
* Time   :4:12:21 PM
* email  :Koppula.Reddy@coforge.com
*/

//program to create instance class and define state and behavior

public class Student {

	//define properties/states/attributes
	
	private int rollNumber;
	private String firstName,lastName;
	private float[] marks=new float[5];
	private float total=0;
	
	Scanner scan=new Scanner(System.in);
	
	//define method/behavior
	
	 public void inputStudentDetails() {
		 System.out.println("Enter roll of student:");
		 rollNumber=scan.nextInt();
		 System.out.println("Enter first name and last name");
		 firstName=scan.nextLine();
		 lastName=scan.nextLine();
		 System.out.println("enter the marks");
		 for(int i=0;i<marks.length;i++) {
			 marks[i]=scan.nextFloat();
		 }
		
	}
	 
	 public float calcuateTotal() {
		 for(int i=0;i<marks.length;i++) {
			 total+=marks[i];
		 }
		 return total;
	 }
	 
	 public void Display() {
		 System.out.println("********student result information*********");
		 System.out.println("RollNumber    :"+rollNumber);
		 System.out.println("Student Name  :"+firstName+" "+lastName);
		 System.out.println("total marks   :"+total);
		
	}
	 

}
