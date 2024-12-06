package controlflow;

import java.util.Scanner;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 24, 2024
 * Time   :12:39:04 PM
 * email  :Koppula.Reddy@coforge.com
 */

public class Switchdemo2 {

	public static void main(String[] args) {

		float num1,num2,result ;
		String operator;
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter 2 Numbers :");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		System.out.println("Enter Arithmetic Operator (+,-,*,/) :");
		operator=scanner.next();
		switch (operator) {

		case "+": result =num1+num2;
		System.out.println(result);
		break;
		case "-": result =num1-num2;
		System.out.println(result);
		break; 
		case "*": result =num1*num2;
		System.out.println(result);
		break;
		case "/": result =num1/num2;
		System.out.println(result);
		break;
		default : System.out.println("invalid");
				break;
		}
		
		scanner.close();
	}

}
