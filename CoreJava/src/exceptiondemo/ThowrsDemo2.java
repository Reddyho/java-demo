package exceptiondemo;

/**
* Author :Koppula.Reddy
* Date   :Nov 6, 2024
* Time   :4:23:59 PM
* email  :Koppula.Reddy@coforge.com
*/

public class ThowrsDemo2 {

	public static void main(String[] args) {

		 Product product1=new Product("Laptop",50000);
	        System.out.println("Product Created :"+product1.getName()+" "+product1.getPrice());

	        Product product2=new Product("Cell Phone",25000);
	        System.out.println("Product Created :"+product2.getName()+" "+product2.getPrice());
	        
	        try {
	        	product1.applyDiscount(10);
	        	System.out.println("the discount price of:"+product1.getName()+" "+product1.getPrice());
	        	
	        	product2.applyDiscount(101);
	        	System.out.println("the discount price of:"+product2.getName()+" "+product2.getPrice());
	        	
	        	
	        }
	        catch(IllegalArgumentException e){
	        	System.err.println("Error"+e.getMessage());
	        }
	}

}
