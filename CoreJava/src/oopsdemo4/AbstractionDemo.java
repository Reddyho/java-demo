package oopsdemo4;

/**
* Author :Koppula.Reddy
* Date   :Oct 30, 2024
* Time   :11:40:58 AM
* email  :Koppula.Reddy@coforge.com
*/

public class AbstractionDemo {

	public static void main(String[] args) {

		Traning t1=new Marks("tejs", "hyd", 306, 85.78);
		System.out.println(t1);
		double r=t1.calcuateMarks();
		System.out.println(r);
	}

}
