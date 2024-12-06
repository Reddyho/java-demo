package arraydemo;

import java.util.Scanner;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 25, 2024
 * Time   :12:04:41 PM
 * email  :Koppula.Reddy@coforge.com
 */

public class Arrayinou2 {
	//Program to enter elements into Array & Display it

	public static void main(String[] args) {



		//Array declaration
		int[] age =new int[10];
		Scanner scanner=new Scanner(System.in);

		//Array input
		System.out.println("Enter 10 Student's Age :");
		for (int i = 0; i < age.length; i++) {
			age[i]=scanner.nextInt();
		}

		//Process age to check they are eligible to vote or not
		for (int i = 0; i < age.length; i++) {
			if(age[i] >=18) {
				System.out.println(age[i]+" is Eligible");
			}
		}

		//Output
		System.out.println("Age Array Contents are : ");
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i]+"\t");
		}
		scanner.close();
	}

}
