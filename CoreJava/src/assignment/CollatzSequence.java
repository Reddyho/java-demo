package assignment;

import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Nov 4, 2024
* Time   :11:01:17 AM
* email  :Koppula.Reddy@coforge.com
*/

public class CollatzSequence {

	public static void main(String[] args) {

		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		n=sc.nextInt();
		System.out.println(n);
		while(n>1) {
			if (n%2==0) {
				n=n/2;
				System.out.println(n);
			}
			else {
				n=3*n+1;
				System.out.println(n);
			}
		}
	}

}
