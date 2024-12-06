package oopsDemo3;

/**
* Author :Koppula.Reddy
* Date   :Oct 29, 2024
* Time   :2:51:39 PM
* email  :Koppula.Reddy@coforge.com
*/

public class Product {
	private String name;
    private double price;
    
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
    
	 // Method to display product details
    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }

}
