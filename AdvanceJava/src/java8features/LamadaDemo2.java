package java8features;

/**
* Author :Koppula.Reddy
* Date   :Nov 8, 2024
* Time   :12:24:26 PM
* email  :Koppula.Reddy@coforge.com
*/

public class LamadaDemo2 {

	public static void main(String[] args) {

		NumericTest isEven=(n) -> (n%2==0);
		NumericTest isNegative=(n) -> (n<0);
		
		System.out.println("7 is even number:"+isEven.computeTest(7));
		System.out.println("-55 is negative:"+isNegative.computeTest(-55));
		
		//boolean a=(n) -> (n%2==0); //error -lambda exepression  should be stored in instance of fi
	}

}
