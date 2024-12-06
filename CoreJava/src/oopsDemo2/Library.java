package oopsDemo2;

import java.util.List;

/**
* Author :Koppula.Reddy
* Date   :Oct 29, 2024
* Time   :11:41:31 AM
* email  :Koppula.Reddy@coforge.com
*/

public class Library {

	private List<Book>Books;//composition-library has book reference object

	public Library(List<Book> books) {
		Books = books;
	}
	
	//getter method only

	public List<Book> getBooks() {
		return Books;
	}
	
	
	
}
