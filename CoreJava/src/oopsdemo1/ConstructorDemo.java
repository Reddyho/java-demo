package oopsdemo1;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 26, 2024
 * Time   :2:36:23 PM
 * email  :Koppula.Reddy@coforge.com
 */

public class ConstructorDemo {
	int id;
	String name;
	float salary;

	public ConstructorDemo() {
		System.out.println("No augs constructor");
		this.id=101;
		this.name="honey";
		this.salary=76876.00f;
	}
	
	

	public ConstructorDemo(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	public void name() {
		System.out.println("i am a method");
		System.out.println(this.id+" "+this.name+" "+this.salary);
	}
	public static void main(String[] args) {

		ConstructorDemo cd1=new ConstructorDemo();
		ConstructorDemo cd2=new ConstructorDemo(1002,"honey",766356.00f);

		cd1.name();
		cd2.name();

	}

}
