package oopsdemo4;

/**
* Author :Koppula.Reddy
* Date   :Oct 30, 2024
* Time   :11:36:02 AM
* email  :Koppula.Reddy@coforge.com
*/

public class Marks extends Traning{
	private double marks;

	public Marks(String name, String address, int number,double marks) {
		super(name, address, number);
		this.marks=marks;

		
	}

	@Override
	public double calcuateMarks() {
      System.out.println("Marks :"+marks);
		return (marks*2);
	}

}
