package oopsDemo2;

/**
* Author :Koppula.Reddy
* Date   :Oct 29, 2024
* Time   :10:23:32 AM
* email  :Koppula.Reddy@coforge.com
*/

public class MagazineAggregationDemo {

	public static void main(String[] args) {

		Author au1=new Author("teja", 22, "india");
		Publisher pu1=new Publisher("sun publishers", "jdsr-115", "AP");
		Magazine m1=new Magazine("jagan mamaya", 15000, au1, pu1);
		m1.display();
	}

}
