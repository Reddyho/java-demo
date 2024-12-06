package assignment;

import java.util.Scanner;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 24, 2024
 * Time   :9:28:20 PM
 * email  :Koppula.Reddy@coforge.com
 */

public class EvenorOdd {

	public static void main(String[] args) {

		int a;

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number:");
		a=scan.nextInt();

		if(a%2==0) {
			System.out.println(a+" is even");
		}
		else {
			System.out.println(a+"is odd");
		}

		scan.close();
	}

}
