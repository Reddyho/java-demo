package oopsDemo2;

/**
* Author :Koppula.Reddy
* Date   :Oct 28, 2024
* Time   :10:32:52 AM
* email  :Koppula.Reddy@coforge.com
* 
* 
* progrm to demonstrate single inheritance
*/

public class SingleInheritanceDemo {

	public static void main(String[] args) {

		Developer d1=new Developer(123, "teja", 27000, "java");
		Developer d2=new Developer(1234, "ajay", 28000, "jdbc");
		Developer d3=new Developer(1235, "chandu", 26000, "Spring");
		
		d1.display();
		d1.displayDeveloperDetails();
		
		d2.display();
		d2.displayDeveloperDetails();
		
		d3.display();
		d3.displayDeveloperDetails();
		
		Employee e1=new Employee(122, "ravi", 35000);
		Employee e2=new Employee(123, "satya", 36000);
		
		
		System.out.println("**********Normal Employee Details*********");
		e1.display();
		e1.display();
	}

}
