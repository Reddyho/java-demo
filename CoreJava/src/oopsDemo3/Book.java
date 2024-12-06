package oopsDemo3;

/**
* Author :Koppula.Reddy
* Date   :Oct 29, 2024
* Time   :3:28:17 PM
* email  :Koppula.Reddy@coforge.com
*/

public class Book extends Item{
	private String author;

	public Book(String name, int price,String author) {
		super(name, price);
        this.author=author;
	}

	@Override
	void display() {
		super.display();
		System.out.println("Author    :"+author);
	}
	
	
	

}
