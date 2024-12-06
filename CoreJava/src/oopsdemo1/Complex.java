package oopsdemo1;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 26, 2024
 * Time   :2:59:59 PM
 * email  :Koppula.Reddy@coforge.com
 * 
 * Program to Add 2 Complex Numbers - Real & Imaginary Part
 * Demonstrate constructors & this keyword
 */

public class Complex {

	private double real;
	private double imaginary;

	//generate parametrized constructor
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	//logic to add 2 complex numbers
	//method accpecting complex object parameter
	public void add(Complex obj) {
		this.real+=obj.real;
		this.imaginary+=obj.imaginary;

	}

	public void display() {
		System.out.println("The Addition of 2 Complex Numbers is :");
		System.out.println("r"+this.real+" i"+this.imaginary);
	}



}

