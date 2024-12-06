package oopsDemo2;

/**
* Author :Koppula.Reddy
* Date   :Oct 28, 2024
* Time   :10:25:31 AM
* email  :Koppula.Reddy@coforge.com
*/

// child class of employee
public class Developer extends Employee {

	private String tech;
	
	public Developer(int empId, String name, float basic,String tech) {
		super(empId, name, basic);
		this.tech=tech;

		
	}
	public void displayDeveloperDetails() {
		System.out.println("technology    :"+this.tech);
		System.out.println("**************************");
	}

}
