package assignment;

import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Oct 24, 2024
* Time   :9:13:02 PM
* email  :Koppula.Reddy@coforge.com
*/

public class Currentage {

	public static void main(String[] args) {

		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the birth year:");
		a=sc.nextInt();
		
		b=2024-a;
		System.out.println("the person age is:"+b);
		
		sc.close();
	}

}
