package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

/**
* Author :Koppula.Reddy
* Date   :Nov 6, 2024
* Time   :12:06:24 PM
* email  :Koppula.Reddy@coforge.com
*/

public class ComparableDemo {

	public static void main(String[] args) {

		ArrayList<Students> al=new ArrayList<Students>();
		al.add(new Students(111, "jhon", 29));
		al.add(new Students(222, "teja", 21));
		al.add(new Students(333, "chandu", 23));
		al.add(new Students(555, "chandus", 20));
		al.add(new Students(666, "ajay", 23));
		
		Collections.sort(al);
		for(Students s:al) {
			System.out.println(s.getRollNo()+" "+s.getName()+" "+s.getAge());
		}
	}

}
