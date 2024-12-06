package oopsDemo3;

/**
* Author :Koppula.Reddy
* Date   :Oct 29, 2024
* Time   :12:28:02 PM
* email  :Koppula.Reddy@coforge.com
*/

public class OverLoadDemo {

	public static void main(String[] args) {

		Addition a1=new Addition(45, 55);
		
		a1.add(33);
		a1.add(35.8, 89.0);
		a1.add(56, 98.00);
		a1.add(33, 55);
		a1.add("dhwiu", "wgyug");
		a1.add(32, 45, 78);
	}

}
