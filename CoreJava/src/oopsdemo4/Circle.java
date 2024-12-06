package oopsdemo4;

/**
* Author :Koppula.Reddy
* Date   :Oct 30, 2024
* Time   :10:47:04 AM
* email  :Koppula.Reddy@coforge.com
*/

public class Circle extends Shape {

	private final double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcuateArea() {
		return radius*radius*Math.PI;
	}
	

}
