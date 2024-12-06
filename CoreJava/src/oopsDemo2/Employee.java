package oopsDemo2;

/**
* Author :Koppula.Reddy
* Date   :Oct 28, 2024
* Time   :10:15:54 AM
* email  :Koppula.Reddy@coforge.com
*/
//parent Class

public class Employee {
	
	private int empId;
	private String name;
	private float basic;
	
	//Generate constructed using fields
	public Employee(int empId, String name, float basic) {
		this.empId = empId;
		this.name = name;
		this.basic = basic;
	}
	
	
	
	
	public void display() {
		System.out.println("***********Employee information*********");
		System.out.println("Employee Id     :"+empId);
		System.out.println("Employee name   :"+name);
		System.out.println("Basic Salary    :"+basic);
		
	}
	

	
	

}
