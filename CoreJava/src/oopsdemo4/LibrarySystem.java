package oopsdemo4;

/**
* Author :Koppula.Reddy
* Date   :Oct 30, 2024
* Time   :12:57:44 PM
* email  :Koppula.Reddy@coforge.com
*/

public class LibrarySystem {

	public static void main(String[] args) {

		Library l1=new Library();
		l1.displayItems();
		
		l1.borrowItem("450bc");
		l1.borrowItem("the great teja");
		l1.returnItem("450bc");
		
		l1.displayItems();
	}

}
