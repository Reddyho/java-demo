package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;


/**
* Author :Koppula.Reddy
* Date   :Nov 5, 2024
* Time   :12:39:55 PM
* email  :Koppula.Reddy@coforge.com
*/

public class ArrayListDemo {

	public static void main(String[] args) {

		//generic arrylist
		
		ArrayList<String> a1=new ArrayList<String>();
		
		
		//add elements
		a1.add("java");
		a1.add("pele");
		a1.add("c++");
		a1.add("c++ 5.0f");
		a1.add("java");
		a1.add("python");
		
		System.out.println(a1);
		
		System.out.println("elements index 1:"+a1.get(1));
		
		System.out.println("does list contain element java:"+a1.contains("java"));
		
		
		//add elements at spefic index
		a1.add(2,"oracale");
		System.out.println(a1);
		
		System.out.println("is array list empty?:"+a1.isEmpty());
		
		System.out.println("index of pele:"+a1.indexOf("pele"));
		
		System.out.println("size of array list:"+a1.size());
		
		//collections is a utlitity class
		
		Collections.sort(a1);
		System.out.println("array list after sorting:"+a1);
		
		//a1.add(100);
		
		ArrayList<Integer> a2=new ArrayList<Integer>();//default size is 10
		
		a2.add(100);
		a2.add(200);
		a2.add(500);
		a2.add(69);
		a2.add(88);
		
		System.out.println(a2);
		System.out.println("Size :"+a2.size());
	}

}
