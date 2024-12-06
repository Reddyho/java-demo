package oopsDemo2;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 28, 2024
 * Time   :11:39:09 AM
 * email  :Koppula.Reddy@coforge.com
 */

public class ShoppingCart extends Customer{
	//Child class of Customer for Managing Cart
	private String[] items;
	private  int itemCount;

	public ShoppingCart(String name, String email) {
		super(name, email);
		items=new String[5]; //Max 10 items can be Added to Cart
		itemCount=0; //To Keep Track of no. of Items in Cart
	}

	public void addItem(String item){
		if(itemCount < items.length){
			items[itemCount]=item;
			itemCount++;
			System.out.println(item+" Added to Cart");
		}else {
			System.out.println("Cart is Full. Cannot Add More Items.");
		}
	}

	public void displayCart(){
		System.out.println("Items in Cart: ");
		for (int i = 0; i < itemCount; i++) {
			System.out.println("\t"+items[i]);
		}
	}



}
