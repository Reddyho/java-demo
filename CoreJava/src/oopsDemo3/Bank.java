package oopsDemo3;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 29, 2024
 * Time   :2:31:46 PM
 * email  :Koppula.Reddy@coforge.com
 * 
 *  Overriding is a feature that allows a subclass or
 child class to provide a specific implementation of a method
 that is already provided by one of its super-classes or parent classes.
 */

public class Bank {

    private String name;

	public Bank(String name) {
		this.name = name;
	}
    
    //method overriding
	
	int getRateofInterest() {
		return 0;
	}
	void display() {
		System.out.println("welecome to "+name+" bank");
	}
}
class SBI extends Bank{

	public SBI(String name) {
		super(name);
	}

	@Override
	int getRateofInterest() {
		return 5;
	}
}
class Axis extends Bank{

	public Axis(String name) {
		super(name);
	}

	@Override
	int getRateofInterest() {
		return 6;
	}
}
class ICICI extends Bank{

	public ICICI(String name) {
		super(name);
	}

	@Override
	int getRateofInterest() {
		return 7;
	}
	
	
}
