package oopsDemo2;

/**
* Author :Koppula.Reddy
* Date   :Oct 29, 2024
* Time   :11:39:18 AM
* email  :Koppula.Reddy@coforge.com
*/

public class Book {
	
	String title,author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	

}
