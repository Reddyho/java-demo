package oopsdemo1;

/**
* Author :Koppula.Reddy
* Date   :Oct 25, 2024
* Time   :4:38:54 PM
* email  :Koppula.Reddy@coforge.com
*/

public class StudentTest {

	public static void main(String[] args) {

		//create student object
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		//invoke instance class using dot operator
		s1.inputStudentDetails();
		s2.inputStudentDetails();
		s3.inputStudentDetails();
		
		float tot1=s1.calcuateTotal();
		float tot2=s2.calcuateTotal();
		float tot3=s3.calcuateTotal();
		
		s1.Display();
		System.out.println("Display total marks:"+tot1);
		s2.Display();
		System.out.println("Display total marks"+tot2);
		s3.Display();
		System.out.println("Display total marks"+tot3);
	}

}
