package oopsDemo2;

/**
* Author :Koppula.Reddy
* Date   :Oct 28, 2024
* Time   :10:46:57 AM
* email  :Koppula.Reddy@coforge.com
*/

public class Faculty {
	private String name;
    private String facultyId;
    private double salary;
    
    
	public Faculty(String name, String facultyId, double salary) {
		this.name = name;
		this.facultyId = facultyId;
		this.salary = salary;
	}
    
    
	  // Method to display faculty details
    public void displayDetails() {
    	System.out.println("*********** University Faculty Details **********");
        System.out.println("Name: " + name);
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Salary: $" + salary);
    }
	

}
