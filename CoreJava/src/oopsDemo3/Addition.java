package oopsDemo3;

/**
* Author :Koppula.Reddy
* Date   :Oct 29, 2024
* Time   :12:14:51 PM
* email  :Koppula.Reddy@coforge.com
*/

public class Addition {
	private int a,b;

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	//add() method is overloaded
	
   public void add() {
	   System.out.println("*********Method Overloading************");
	   System.out.println("the addition of two numbers is:"+(a+b));
	
}

   public void add(int x) {
	   
	System.out.println("the addition of single numbers to itself:"+(x+x));

   }
   public void add(int x,int y) {
	   
	System.out.println("the addition of two numbers to itself:"+(x+y));

   }
   public void add(int x,float y) {
	   
	System.out.println("the addition of float of two numbers to itself:"+(x+y));

   }
   public void add(String x,String y) {
	   
	System.out.println("the addition of string two varibles to itself:"+(x+y));

   }
   public void add(double x,double y) {
	   
	System.out.println("the addition of two double numbers to itself:"+(x+y));

   }
   public void add(int x,int y,int z) {
	   
	System.out.println("the addition of three numbers to itself:"+(x+y+z));

   }
}
