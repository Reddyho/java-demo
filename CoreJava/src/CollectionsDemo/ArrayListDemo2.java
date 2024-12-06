package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
* Author :Koppula.Reddy
* Date   :Nov 5, 2024
* Time   :2:18:41 PM
* email  :Koppula.Reddy@coforge.com
*/

public class ArrayListDemo2 {

	public static void main(String[] args) {

		 ArrayList<String> names =new ArrayList<>();

	        names.add("James"); //AutoBoxing
	        names.add("Mary");
	        names.add("Micheal");
	        names.add("Jim");
	        names.add("Robert");

	        System.out.println("Display ArrayList as List Without Loop :"+names);

	        System.out.println("********* Display Collection Objects using Classic For Loop ************");
	        
	        for (int i=0;i<names.size();i++) {
	        	System.out.println(names.get(i));
	        }
	        
	        names.add(3, "teja");
	        names.remove(0);
	        names.set(2, "reddy");
	        
	        
	        System.out.println("***********Display content using for each loop******************");
	        for(String i:names) {
	        	System.out.println(i);
	        }
	        
	        ArrayList<Double> marks =new ArrayList<>();

	        marks.add(99.55);
	        marks.add(55.00);
	        marks.add(35.60);
	        marks.add(74.15);
	        marks.add(82.45);
	        
	        System.out.println("***********display collection objects using iterator*************");
	        
	        Iterator<Double> itr=marks.iterator();
	        while (itr.hasNext()) {
	        	System.out.println(itr.next());
	        }
	        
	        //collections utlity class function
	        
	        Collections.sort(marks);
	        System.out.println("the marks of array list after sorting:"+marks);
	        
	        Collections.reverse(marks);
	        
	        System.out.println("the amrks after reversing:"+marks);
	        
	        System.out.println("maximum marks:"+Collections.max(marks));
	        System.out.println("minimum marks:"+Collections.min(marks));
	}

}
