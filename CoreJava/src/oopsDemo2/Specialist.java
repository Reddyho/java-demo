package oopsDemo2;

/**
* Author :Koppula.Reddy
* Date   :Oct 28, 2024
* Time   :2:25:19 PM
* email  :Koppula.Reddy@coforge.com
*/

/*Hierarchical Inheritance Demo
 * 
 *              Doctor
 *  Specialist          NonSpecialist
 */
public class Specialist extends Doctor {
	
	private String speciality;

	public Specialist(int idNumber, String name, String address,String speciality) {
		super(idNumber, name, address);
		this.speciality=speciality;

	}

	public void display() {
		super.display();
		System.out.println("the speciality is :"+speciality);
	}
}

class NonSpecialist extends Doctor{

	public NonSpecialist(int idNumber, String name, String address) {
		super(idNumber, name, address);

	}
	
}
