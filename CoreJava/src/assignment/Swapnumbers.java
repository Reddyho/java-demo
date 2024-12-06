package assignment;

import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Oct 24, 2024
* Time   :8:12:55 PM
* email  :Koppula.Reddy@coforge.com
*/

public class Swapnumbers {

	public static void main(String[] args) {

		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a=:");
		a=sc.nextInt();
		System.out.println("Enter b=:");
		b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		sc.close();
		
	}

}
