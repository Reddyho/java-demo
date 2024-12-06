package genericsdemo;

/**
 * Author :Koppula.Reddy
 * Date   :Nov 5, 2024
 * Time   :11:47:20 AM
 * email  :Koppula.Reddy@coforge.com
 */

//generics class with single parameter

public class Container <T>{

	private T t;

	//method
	public void add(T t) {
		this.t=t;
	}

	//generate getter

	public T getT() {
		return t;
	}

	public static void main(String[] args) {
		Container<String> strContainer=new Container<String>();
		Container<Integer> intContainer=new Container<Integer>();
		Container<Double> dblContainer=new Container<Double>();
		Container<Character> chrContainer=new Container<Character>();

		strContainer.add("James Gosling");
		intContainer.add(1000);
		dblContainer.add(50000.55);
		chrContainer.add('A');

		System.out.println("The String Value is :"+strContainer.getT());
		System.out.println("The Integer Value is :"+intContainer.getT());
		System.out.println("The Double Value is :"+dblContainer.getT());
		System.out.println("The Character Value is :"+chrContainer.getT());
	}


}
