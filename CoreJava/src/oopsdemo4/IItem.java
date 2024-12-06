package oopsdemo4;

/**
* Author :Koppula.Reddy
* Date   :Oct 30, 2024
* Time   :12:42:50 PM
* email  :Koppula.Reddy@coforge.com
* 
* Interface that defines the basic operations for any item in the library
*/

public interface IItem {
	// by default public abstract methods
		String getTitle();
	    String getAuthor();
	    String getCategory();
	    boolean isAvailable();
	    void borrowItem();
	    void returnItem();

}
