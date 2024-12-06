package oopsDemo3;

/**
* Author :Koppula.Reddy
* Date   :Oct 29, 2024
* Time   :3:30:22 PM
* email  :Koppula.Reddy@coforge.com
*/

public class UpcastingDemo {

	public static void main(String[] args) {

		Item item;
		
		//upcasting-child object
		item=new Book("java", 450, "james");
		item.display();
		
		//switch from one implementation to another
		item=new Laptop("ideapad", 60000, "levona");
		item.display();
		
		item=new Book("python", 670, "teja");
		item.display();
	}

}
