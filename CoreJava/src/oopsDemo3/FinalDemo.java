package oopsDemo3;

/**
* Author :Koppula.Reddy
* Date   :Oct 30, 2024
* Time   :9:39:56 AM
* email  :Koppula.Reddy@coforge.com
*/

class MyDemo{
	private static final int MAX_AGE=65;
	private int age=21;
		
	/*
	 * public void test() { MAX_AGE=60; }
	 */
	public final void test1() {
		System.out.println("the age is :"+age);
		
	}
}

/*
 * class MyTemp extends MyDemo{ public void test1() {
 * System.out.println("the age is:"+age);
 * 
 * }
 * 
 * }
 */

final class Hello{
	int a,b;

	public Hello(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Hello [a=" + a + ", b=" + b + "]";
	}
	
}

//class Worls extends Hello{
	
//}
public class FinalDemo {
	public static void main(String[] args) {
		
	}

}
