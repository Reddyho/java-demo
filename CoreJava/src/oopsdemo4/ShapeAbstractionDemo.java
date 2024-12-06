package oopsdemo4;

/**
* Author :Koppula.Reddy
* Date   :Oct 30, 2024
* Time   :10:53:41 AM
* email  :Koppula.Reddy@coforge.com
*/

public class ShapeAbstractionDemo {

	public static void main(String[] args) {

		Shape s1;
		s1=new Circle(7.5);
		System.out.println("Area is:"+s1.calcuateArea());
		s1=new Square(45);
		System.out.println("area is:"+s1.calcuateArea());
		
	}

}
