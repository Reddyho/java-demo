package oopsdemo1;

/**
* Author :Koppula.Reddy
* Date   :Oct 26, 2024
* Time   :3:41:10 PM
* email  :Koppula.Reddy@coforge.com
*/

public class TimeTest {

	public static void main(String[] args) {

		Time t1=new Time(12, 45, 55);
		Time t2=new Time(10, 30, 30);
		t1.add(t2);
		t1.display();
	}

}
