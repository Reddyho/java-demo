package stringsDemo;

/**
* Author :Koppula.Reddy
* Date   :Nov 4, 2024
* Time   :12:09:59 PM
* email  :Koppula.Reddy@coforge.com
*/

public class StringComperasionDemo {
	public static void main(String[] args) {
		
		String s1="teja";
		String s2="Teja";
		//String s2="teja";
		
		String s3=new String("Helo world");
		String s4=new String("Helo world");
		
		if(s1==s2) {
			System.err.println("Strings are equal");
		}
		else {
			System.out.println("strings are not equal");
		}
		
		if (s3.equals(s4)) {
			System.out.println("strings are equal");
		}
		else {
			System.out.println("not equal");
		}
	}

}
