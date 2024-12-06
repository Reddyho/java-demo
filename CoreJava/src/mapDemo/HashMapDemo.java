package mapDemo;

import java.util.HashMap;
import java.util.Map;

/**
* Author :Koppula.Reddy
* Date   :Nov 6, 2024
* Time   :10:16:42 AM
* email  :Koppula.Reddy@coforge.com
*/

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		hm.put(111, "jhon");
		hm.put(222, "teja");
		hm.put(333, "ajay");
		
		hm.put(null, "honey");
		hm.put(null, "abhi");
		hm.put(444, "chandu");
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
