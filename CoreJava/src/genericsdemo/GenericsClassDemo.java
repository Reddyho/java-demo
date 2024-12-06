package genericsdemo;

/**
* Author :Koppula.Reddy
* Date   :Nov 5, 2024
* Time   :11:24:15 AM
* email  :Koppula.Reddy@coforge.com
*/

class Sample<T>{//parametrise calss or genecis class
	private T data;

	public Sample(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
public class GenericsClassDemo {
	
	public static void main(String[] args) {
		
		Sample<String> s1=new Sample<>("teja reddy");
		
		System.out.println("display the generics class by passing string:"+s1.getData());
		
		Sample<Integer> s2=new Sample<>(123);
		
		System.out.println("display the generics class by passing integer:"+s2.getData());
		
		Sample<Double> s3=new Sample<>(55.00);
		
		System.out.println("display the generics class by passing double"+s3.getData());
	}

}
