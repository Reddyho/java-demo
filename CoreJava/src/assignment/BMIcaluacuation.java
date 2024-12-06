package assignment;

import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Oct 24, 2024
* Time   :9:18:34 PM
* email  :Koppula.Reddy@coforge.com
*/

public class BMIcaluacuation {

	public static void main(String[] args) {

		int a;
		float b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Weight kg:");
		a=sc.nextInt();
		System.out.println("Enter the height in meters:");
		b=sc.nextFloat();
		c=(float)a/(b*b);
		System.out.println("your BMI is "+c);
		
		sc.close();
	}

}
