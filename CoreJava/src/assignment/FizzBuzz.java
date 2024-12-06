package assignment;

import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Nov 4, 2024
* Time   :9:39:45 AM
* email  :Koppula.Reddy@coforge.com
*/

public class FizzBuzz {

	public static void main(String[] args) {
		int a;

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			if (i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			else if (i%5==0) {
				System.out.println("Buzz");
			}
			
			else {
				System.out.println(i);
			}
		}
		
	}

}
