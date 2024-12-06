package oopsDemo3;

/**
* Author :Koppula.Reddy
* Date   :Oct 29, 2024
* Time   :2:57:34 PM
* email  :Koppula.Reddy@coforge.com
*/

public class ClothingProduct extends Product {
	private String size;
    private String color;
    
	public ClothingProduct(String name, double price,String size,String color) {
		super(name, price);
		this.size=size;
		this.color=color;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		 System.out.println("Size   : "+size);
	        System.out.println("Color  : "+color);
	        System.out.println("Material: Cotton");
	}
	
	

}
