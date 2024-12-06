package java8features;

/**
 * Author :Koppula.Reddy
 * Date   :Nov 8, 2024
 * Time   :3:26:43 PM
 * email  :Koppula.Reddy@coforge.com
 */

//Method Reference - Shorthand of Lambda expression to call method

@FunctionalInterface
interface MyInterface
{
	void myMethod(int a);
}
class Test // instance class
{
	void display(int y) // instance method
	{
		System.out.println("Iam a Instance Method"+y);
	}
}

public class MethodReferenceDemo1 {

	public static void main(String[] args) {

		//traditional approach
		Test t1=new Test();
		t1.display(100);

		//Java8 Method Reference approach
		MyInterface m1ref=t1::display; // method reference to instance method of Object

		//calling method of FI
		m1ref.myMethod(200);

		// Lambda ---> FI

	}

}
