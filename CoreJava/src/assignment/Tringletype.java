package assignment;

import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Oct 24, 2024
* Time   :9:43:53 PM
* email  :Koppula.Reddy@coforge.com
*/

public class Tringletype {

	public static void main(String[] args) {

		 int a,b,c;
			Scanner scan=new Scanner(System.in);
			System.out.println("Entere Length of 3 sides:");
			a=scan.nextInt();
			b=scan.nextInt();
			c=scan.nextInt();
			
			if(a==b&&b==c) {
				System.out.println("is equilateral");
			}
			else if(a==b||b==c || a==c) {
				System.out.println("is isosceles");
				
			}
			
			else {
				System.out.println("is scalene");
			}
			
			scan.close();
	}

}
