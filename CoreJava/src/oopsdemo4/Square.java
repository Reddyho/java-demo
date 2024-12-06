package oopsdemo4;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 30, 2024
 * Time   :10:51:19 AM
 * email  :Koppula.Reddy@coforge.com
 */

public class Square extends Shape {
	private final double side;


	public Square(double side) {
		this.side = side;
	}


	@Override
	public double calcuateArea() {
		return side*side;
	}

}
