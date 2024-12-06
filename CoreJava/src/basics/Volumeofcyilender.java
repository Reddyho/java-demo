package basics;

import java.util.Scanner;

/*
 * program to find volume of cylinder
 */

public class Volumeofcyilender {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		float a,r,h;   // variables declaration
		final float PI=3.14f; // constant declaration

		System.out.println("Enter Radius of a Circle :");
		r=s.nextFloat();  // float input
		
		System.out.println("Enter the Height:");
		h=s.nextFloat();
		

		a=PI*r*r*h;  // volume of cylinder

		System.out.println("The Area of Circle is : "+a);
		System.out.format("%.2f", a);

		s.close();

		
	}

}
