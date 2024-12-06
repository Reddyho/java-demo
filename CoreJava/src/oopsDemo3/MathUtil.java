package oopsDemo3;

/**
* Author :Koppula.Reddy
* Date   :Oct 29, 2024
* Time   :4:51:46 PM
* email  :Koppula.Reddy@coforge.com
* 
* static method demo
*/

public class MathUtil {
	
	public static int square(int num) {
		return num*num;
		
	}
	public static int myaddition(int a,int b) {
		return a+b;
		
	}
	
		
	

	public static void main(String[] args) {
		int result=MathUtil.square(5);
		System.out.println("the square of number is:"+result);
		
		System.out.println("addition of two numbers is:"+myaddition(25, 54));

		
	}

}
