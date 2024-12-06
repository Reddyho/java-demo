package oopsdemo1;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 26, 2024
 * Time   :4:49:04 PM
 * email  :Koppula.Reddy@coforge.com
 */

//object class is a parent class of all java class

class Test{

	//implement finilize() method of object class
	@Override
	protected void finalize() throws Throwable {
		System.out.println("object destroyer & garbage collecter");
	}

}
public class DestructorDemo {
	public static void main(String[] args) {


		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();
		Test t4=new Test();

		//deallocate memory -objects destroy explicitly
		t1=null;
		t2=null;
		t3=null;

		System.gc();

	}
}
