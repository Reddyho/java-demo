package controlflow;

import java.util.Scanner;

//program to check whether a number is single digit or not

public class SingleDigit {

	public static void main(String[] args) {

		int num;
		Scanner scan=new Scanner(System.in);

		System.out.println("enter numbers:");
		num=scan.nextInt();
		/*
		 * implementing of condition
		 * logical operator
		 */

		if (num>-10 && num<10) {
			System.out.println(num+" is single digit");
		}
		else {
			System.out.println(num+" is not a single digit");
		}

		scan.close();
	}

}
