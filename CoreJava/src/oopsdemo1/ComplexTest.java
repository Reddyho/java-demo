package oopsdemo1;

/**
* Author :Koppula.Reddy
* Date   :Oct 26, 2024
* Time   :3:06:35 PM
* email  :Koppula.Reddy@coforge.com
* 
* program to add two complex numbers
*/

public class ComplexTest {

	public static void main(String[] args) {

		Complex c1=new Complex(10.3, 67.4);
		Complex c2=new Complex(0.7, 3.6);
		
		c1.add(c2);
		c1.display();
		
		Complex c3=new Complex(11.66, 22.50);
		Complex c4=new Complex(20.20, 30.60);
		
		c3.add(c4);
		c3.display();
		
	}

}
