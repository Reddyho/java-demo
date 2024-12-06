package oopsDemo2;

/**
* Author :Koppula.Reddy
* Date   :Oct 28, 2024
* Time   :11:35:13 AM
* email  :Koppula.Reddy@coforge.com
* 
* Single Inheritance demo for Online-Shopping
*/

public class Customer {

	private String name;
	private String email;

	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
 
    
    public void display(){
        System.out.println("********** Customer Details ************");
        System.out.println("Customer Name    : "+name);
        System.out.println("Email            : "+email);
    }
}
