package oopsDemo3;

/**
* Author :Koppula.Reddy
* Date   :Oct 29, 2024
* Time   :2:52:03 PM
* email  :Koppula.Reddy@coforge.com
*/

public class ElectronicProduct extends Product{
	private String brand;
	private String model;

	public ElectronicProduct(String name, double price,String brand,String model) {
		super(name, price);
		this.brand=brand;
		this.model=model;

		
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
	    System.out.println("Brand   : "+brand);
        System.out.println("Model   : "+model);
        System.out.println("Warranty: 1 Year");
	}
	
	

	
}
