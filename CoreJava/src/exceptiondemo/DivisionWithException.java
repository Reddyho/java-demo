package exceptiondemo;

import java.util.Scanner;

/**
 * Author :Koppula.Reddy
 * Date   :Nov 6, 2024
 * Time   :12:51:44 PM
 * email  :Koppula.Reddy@coforge.com
 * 
 * exception handling done with try,catch,finally
 */

public class DivisionWithException {

	public static void main(String[] args) {

		//Division of 2 Numbers without Exception Handling

		int a, b, result;
		Scanner input = new Scanner(System.in);

		System.out.println("Input two integers :");
		a = input.nextInt();
		b = input.nextInt();

		try {
		result = a / b; //Exception is thrown by JRE for Divide by Zero Exception
		System.out.println("Result = " + result);
		}
		//Exception thrown in try block is handled in catch block
        //using Exception Object
		
		catch(ArithmeticException ex) {
			System.out.println("plese enter second number with non zero");
			System.err.println("exception handling& description :"+ex.toString());
			System.err.println("exception decription :"+ex.getMessage());
			
			ex.printStackTrace();
		}
		
		finally {
		input.close();
		System.out.println("in finally block");
	}

}
}
