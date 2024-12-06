package java8features;

/**
* Author :Koppula.Reddy
* Date   :Nov 8, 2024
* Time   :12:36:59 PM
* email  :Koppula.Reddy@coforge.com
*/

//block lambda expressions
public class LambdaDemo2 {

	public static void main(String[] args) {

		MyString revstr=(str) ->{
			String result="";
			for(int i=str.length()-1;i>=0;i--) 
				result+=str.charAt(i);
			return result;	
		};
		System.out.println(revstr.mystringFunction("lambda expression"));
		System.out.println(revstr.mystringFunction("madam"));
		System.out.println(revstr.mystringFunction("helo world java"));
		
		MyString myname=(name) -> {return "hello" +name;};
		System.out.println(myname.mystringFunction("james"));
		
		
		MyString s=(str) ->{
			return "length of string is:"+str.length();
			
		};
		System.out.println(s.mystringFunction("james"));
	}

}
