package assignment;

/**
* Author :Koppula.Reddy
* Date   :Oct 27, 2024
* Time   :4:33:31 PM
* email  :Koppula.Reddy@coforge.com
*/

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e1=new Employee();
		Employee e2=new Employee();

		e1.getInfo();
		e1.addSal();
		e1.addWork();
		e1.display();
		
		e2.getInfo();
		e2.addSal();
		e2.addWork();
		e2.display();
	}

}
