package exceptiondemo;

import java.util.Scanner;

/**
 * Author :Koppula.Reddy
 * Date   :Nov 6, 2024
 * Time   :12:51:44 PM
 * email  :Koppula.Reddy@coforge.com
 */

public class Division {

	public static void main(String[] args) {

		//Division of 2 Numbers without Exception Handling

		int a, b, result;
		Scanner input = new Scanner(System.in);

		System.out.println("Input two integers :");
		a = input.nextInt();
		b = input.nextInt();

		result = a / b; //Exception is thrown by JRE for Divide by Zero Exception
		System.out.println("Result = " + result);

		input.close();
	}

}
