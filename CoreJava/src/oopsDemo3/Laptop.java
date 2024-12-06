package oopsDemo3;

/**
* Author :Koppula.Reddy
* Date   :Oct 29, 2024
* Time   :3:24:04 PM
* email  :Koppula.Reddy@coforge.com
*/

public class Laptop  extends Item {
	private String manufacturer;

	public Laptop(String name, int price,String manufacturer) {
		super(name, price);
       this.manufacturer=manufacturer;
	}

	@Override
	void display() {
		super.display();
		System.out.println("manufacturer     :"+manufacturer);
	}
	
	

}
