package oopsDemo3;

/**
* Author :Koppula.Reddy
* Date   :Oct 29, 2024
* Time   :3:00:58 PM
* email  :Koppula.Reddy@coforge.com
*/

public class OverrideDemo2 {

	public static void main(String[] args) {

		ElectronicProduct ep1=new ElectronicProduct("lapatop", 999.99, "Dell", "latitude");
		ClothingProduct cp1=new ClothingProduct("T-shirt", 15.50f, "large", "black");
		
		System.out.println("**********Electronic Product Details**************");
		ep1.displayDetails();
		System.out.println("***********Clothing Product details*****************");
		cp1.displayDetails();
	}

}
