package CollectionsDemo;

/**
 * Author :Koppula.Reddy
 * Date   :Nov 5, 2024
 * Time   :2:52:35 PM
 * email  :Koppula.Reddy@coforge.com
 */

//Class for Storing Book Object in ArrayList

public class Book {

	int id;
	String name,author,publisher;
	int quantity;
	
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getQuantity() {
		return quantity;
	}
	
	
	

}
