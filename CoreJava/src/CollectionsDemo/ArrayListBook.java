package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Author :Koppula.Reddy
 * Date   :Nov 5, 2024
 * Time   :2:54:27 PM
 * email  :Koppula.Reddy@coforge.com
 * 
 * Java Program to store & display User-defined Book Objects in Collections
 */

//Creating Books  object & initialized using Book Constructor

public class ArrayListBook {

	public static void main(String[] args) {		 
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
		
		//create array list of books
		List<Book> bl=new ArrayList<>();
		
		//add books
		
		bl.add(b1);
		bl.add(b2);
		bl.add(b3);
		bl.add(new Book(104,"java made simple","james","prime",15));
		
		
		System.out.println("************book list****************");
		for (Book i:bl) {
			System.out.println(i.id+" "+i.name+" "+i.author+" "+i.publisher+" "+i.quantity);
		}
		System.out.println("the total number of books is:"+bl.size());
		
		String pub="wiley";
		for(Book i:bl) {
			if(i.getPublisher().equalsIgnoreCase(pub)) {
				System.out.println(i.id+" "+i.name+" "+i.author+" "+i.publisher+" "+i.quantity);
			}
		}
	}

}
