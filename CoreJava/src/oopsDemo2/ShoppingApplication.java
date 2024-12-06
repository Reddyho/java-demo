package oopsDemo2;

import java.util.Scanner;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 28, 2024
 * Time   :11:47:38 AM
 * email  :Koppula.Reddy@coforge.com
 */

public class ShoppingApplication {

	public static void main(String[] args) {

		//Main class for testing Shopping Cart . Customer --> ShoppingCart

		Scanner sc=new Scanner(System.in);
		System.out.println("********** Online Shopping Portal ************");
		System.out.println("Enter customer name & email");
		String name=sc.nextLine();
		String email=sc.nextLine();
		sc.close();
		
		ShoppingCart cart1 =new ShoppingCart(name,email);

		

		//Add items to Cart
		cart1.addItem("Boat Ear Buds");//Invoke method addItem() for Object cart1
		cart1.addItem("Logitech Mouse");
		cart1.addItem("Samsung HDD");
		cart1.addItem("HP Laser Printer");
		cart1.addItem("HP Laser");
		cart1.addItem("HP Printer");

		System.out.println("Customer Details :");
		cart1.display(); //Base class method
		System.out.println("Cart Details :");
		cart1.displayCart();

	}

}
