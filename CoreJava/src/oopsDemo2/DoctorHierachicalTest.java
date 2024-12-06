package oopsDemo2;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 28, 2024
 * Time   :2:30:24 PM
 * email  :Koppula.Reddy@coforge.com
 * 
 * Java Program to demonstrate Hierarchical Inheritance for initializing & Display
 * different types of Doctors Information
 */

public class DoctorHierachicalTest {

	public static void main(String[] args) {

		Specialist specialistDoctor=new Specialist(10001,"Mary King","Bengaluru","Cardiologist");

		NonSpecialist nonSpecialistDoctor=new NonSpecialist(20001,"Gavin King","Melbourne");

		specialistDoctor.display();
		nonSpecialistDoctor.display();
	}

}
