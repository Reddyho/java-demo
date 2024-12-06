package exceptiondemo;

/**
* Author :Koppula.Reddy
* Date   :Nov 6, 2024
* Time   :3:27:01 PM
* email  :Koppula.Reddy@coforge.com
*/

public class ThrowDemo {
	
	private static void test(int a) {
		if(a==0)
			throw new ArithmeticException("pass non zero value");
		else
			System.out.println("the value passed to the method:"+a);
	}

	public static void main(String[] args) {
		
		ThrowDemo.test(250);
        ThrowDemo.test(0);
	}

}
