package exceptiondemo;

/**
 * Author :Koppula.Reddy
 * Date   :Nov 6, 2024
 * Time   :2:51:35 PM
 * email  :Koppula.Reddy@coforge.com
 * 
		program to handle Null Pointer Exception
 */

public class StringsDemo {

	public static void main(String[] args) {


		String s1="Hello World";
		 String s2=null;
		 String s3="Java";
		try{
			System.out.println(s1.length());
			System.out.println(s3.length());
			System.out.println(s2.length());
			
		}
		catch (Exception exception){
			System.err.println("Exception occurred:"+exception);
		}

	}

}
