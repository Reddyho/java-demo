package oopsDemo3;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 29, 2024
 * Time   :3:22:30 PM
 * email  :Koppula.Reddy@coforge.com
 */

public class Item {
	private String name;
	private int price;

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	void display() {
		System.out.println("********** Item Details ***************");
		System.out.println("Name         : "+name);
		System.out.println("Price        : "+price);
	}



}
