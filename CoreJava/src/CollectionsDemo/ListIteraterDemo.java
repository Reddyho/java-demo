package CollectionsDemo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Author :Koppula.Reddy
 * Date   :Nov 5, 2024
 * Time   :4:30:56 PM
 * email  :Koppula.Reddy@coforge.com
 */

//Program to traverse list in forward & backward direction
// using ListIterator

// Create a LinkedList

public class ListIteraterDemo {
	public static void main(String[] args) {

		LinkedList<String> linkedlist = new LinkedList<String>();

		// Add elements to LinkedList
		linkedlist.add("Delhi");
		linkedlist.add("Agra");
		linkedlist.add("Mysore");
		linkedlist.add("Chennai");
		linkedlist.add("Pune");

		// Obtaining ListIterator - traverse in forward/backward direction
		ListIterator<String> listIt = linkedlist.listIterator();

		// Iterating the list in forward direction
		System.out.println("Forward iteration:");
		while(listIt.hasNext()){
			System.out.println(listIt.next());
		}

		// Iterating the list in backward direction
		System.out.println("\nBackward iteration:");
		while(listIt.hasPrevious()){
			System.out.println(listIt.previous());

		}

		System.out.println("*********** South Cities*************");
		System.out.println("Using subList() Method of List Interface to extract data from List");

		List<String> sCities=linkedlist.subList(2, 4);
		System.out.println(sCities);

		//// Obtaining ListIterator - traverse directly in backward direction
		ListIterator<String> listIt1 = linkedlist.listIterator(linkedlist.size());

		// Iterating the list in backward direction
		System.out.println("\nBackward iteration:");
		while(listIt1.hasPrevious()){
			System.out.println(listIt1.previous());

		}
	}

}
