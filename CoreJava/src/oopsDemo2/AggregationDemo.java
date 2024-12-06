package oopsDemo2;

/**
* Author :Koppula.Reddy
* Date   :Oct 29, 2024
* Time   :10:07:56 AM
* email  :Koppula.Reddy@coforge.com
*/

public class AggregationDemo {

	public static void main(String[] args) {

		Address ad1=new Address("bengaluru", "karanataka", "india", 566016);
		Address ad2=new Address("chennai", "tamil nadu", "india", 522134);
		
		Student s1=new Student(101, "teja", ad1);
		Student s2=new Student(102, "ajay", ad2);
		
		s1.display();
		s2.display();
	}

}
