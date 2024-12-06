package oopsDemo2;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 28, 2024
 * Time   :2:21:53 PM
 * email  :Koppula.Reddy@coforge.com
 */
/*Hierarchical Inheritance Demo
 * 
 *              Doctor
 *  Specialist          NonSpecialist
 */

public class Doctor {

	private int idNumber;
	private String name,address;
	public Doctor(int idNumber, String name, String address) {
		this.idNumber = idNumber;
		this.name = name;
		this.address = address;
	}

	public void display() {
		System.out.println("******** Doctor Details ***********");
		System.out.println("The Doctor Id is   : "+idNumber);
		System.out.println("The Doctor Name is : "+name);
		System.out.println("The Doctor City is : "+address);
	}
}
