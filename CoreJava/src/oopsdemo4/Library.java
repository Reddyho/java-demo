package oopsdemo4;

/**
* Author :Koppula.Reddy
* Date   :Oct 30, 2024
* Time   :12:43:48 PM
* email  :Koppula.Reddy@coforge.com
*/

public class Library {
	private IItem book1;
	private IItem book2;
	public Library() {

		book1=new Book("the great teja", "teja");
		book2=new Book("hwgdyw", "snucb");
		
	}
	public void displayItems() {
        displayItemDetails(book1);
        displayItemDetails(book2);
    }
    
    private void displayItemDetails(IItem item) {
        System.out.println("Title: " + item.getTitle());
        System.out.println("Author: " + item.getAuthor());
        System.out.println("Category: " + item.getCategory());
        System.out.println("Available: " + (item.isAvailable() ? "Yes" : "No"));
        System.out.println();
    }

    public void borrowItem(String title) {
        if (book1.getTitle().equals(title)) {
            book1.borrowItem();
        } else if (book2.getTitle().equals(title)) {
            book2.borrowItem();
        } else {
            System.out.println("Item not found.");
        }
    }

    public void returnItem(String title) {
        if (book1.getTitle().equals(title)) {
            book1.returnItem();
        } else if (book2.getTitle().equals(title)) {
            book2.returnItem();
        } else {
            System.out.println("Item not found.");
        }
    }
	
	

}
