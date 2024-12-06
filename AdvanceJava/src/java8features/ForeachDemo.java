package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author :Koppula.Reddy
 * Date   :Nov 8, 2024
 * Time   :2:36:00 PM
 * email  :Koppula.Reddy@coforge.com
 */

/* 
 * forEach() Method In Iterable Interface
Java 8 has introduced a forEach method in the interface java.lang.Iterable that can 
iterate over the elements in the collection.
forEach is a default method defined in the Iterable interface. 
It is used by the Collection classes that extend the Iterable 
interface to iterate elements.

The forEach method takes the Functional Interface as a single parameter i.e. 
you can pass Lambda Expression as an argument.
 */

public class ForeachDemo {

	public static void main(String[] args) {


		List<String> languages=new ArrayList<>(); // declare ArrayList

		//add elements to List
		languages.add("Java");
		languages.add("Python");
		languages.add("C#");
		languages.add("Scala");
		languages.add("Ruby");
		languages.add("C++");

		System.out.println("********** Programming Languages *************");
		languages.forEach(i ->System.out.println(i));


		List<String> languages1=new ArrayList<>(); // declare ArrayList

		//add elements to List
		languages1.add("Java");
		languages1.add("Python");
		languages1.add("C#");
		languages1.add("Scala");
		languages1.add("Ruby");
		languages1.add("C++");

		System.out.println("********** Programming Languages *************");
		//  i -- input parameter  --left hand side of lambda operator
		// System.out.println(i) -- right hand side is method body
		
		System.out.println("*********print elements using method referance*************");
		languages.forEach(System.out::println);


		// declare a map of customers
		Map<Integer,String> customer=new HashMap<Integer,String>();

		//add elements into map
		customer.put(101,"Alex");
		customer.put(102,"Mike");
		customer.put(103,"Mary");
		customer.put(104,"Navin");
		customer.put(105,"Jack");

		System.out.println("*********** Customer Account No. & Name : *************");
		customer.forEach((k,v) -> System.out.println("key="+k+"---->value="+v) );


		ArrayList<Integer> arrL = new ArrayList<Integer>(); 
		arrL.add(100); 
		arrL.add(24); 
		arrL.add(99); 
		arrL.add(41); 

		System.out.println("********** ArrayList Contents Before Sorting *************");
		arrL.forEach(i -> System.out.println(i)); 

		Collections.sort(arrL);
		// use lambda expressions to print elements of arrayList
		System.out.println("********** ArrayList Contents After Sorting *************");
		arrL.forEach(i -> System.out.println(i)); 

		//use lambda expressions to print even nos in arraylist
		System.out.println("******* Even Numbers in ArrayList ***********");
		arrL.forEach(n -> {if(n%2==0) System.out.println(n);});
		
		//use lambda expression to print nos in arrylist double
		System.out.println("*********Number in array list is double*************");
		arrL.forEach(n -> { n=(n*2);System.out.println(n);});
	}

}
