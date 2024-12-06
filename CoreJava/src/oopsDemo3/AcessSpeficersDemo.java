package oopsDemo3;

import oopsdemo1.Complex;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 30, 2024
 * Time   :9:52:52 AM
 * email  :Koppula.Reddy@coforge.com
 */


class Test{
	int a; // default variable - accessible within the package
	private int b; //private variable - accessible within class only
	protected int c; // accessible in class & subclass
	public int d; //accessible from any part of the project




	public Test(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}




	void display(){ // default method
		System.out.println("Private Variable : "+b);
	}	
}

class Test2 extends Test{

	public Test2(int a, int b, int c, int d) {
		super(a, b, c, d);


	}
	public void display(){ // default method
		System.out.println("protected Variable : "+c);


	}
}
public class AcessSpeficersDemo {

	public static void main(String[] args) {

		Test t1=new Test(100, 200, 300, 400);
		t1.display();

		System.out.println("the deafult variable in new class is:"+t1.a);

		Test2 t2=new Test2(300, 400, 500, 600);
		t2.display();

		Complex c1=new Complex(10.3, 67.4);
		Complex c2=new Complex(0.7, 3.6);

		c1.add(c2);
		c1.display();
	}

}

