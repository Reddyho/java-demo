package basics;

import java.util.Scanner;

/*
 * using scanner input method
 */

public class Arithmetic {

	public static void main(String[] args) {

		//decleration of variables
		int a,b,sum,sub,mult;
		float div;
		String name;
		
		// input statements
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Numbers :");
		a=scan.nextInt();
		b=scan.nextInt();
		System.out.println("Enter Name:");
		scan.nextLine();
		name=scan.nextLine();
		
		//process
		
		sum=a+b;
		sub=a-b;
		mult=a*b;
		div=(float)a/b;
		
		//Display output
		System.out.println("Addition:"+sum);
		System.out.println("subrastation:"+sub);
		System.out.println("Multiplucation:"+mult);
		System.out.println("Division:"+div);
		System.out.println("Addition:"+sum);
		System.out.println("Program done by :"+name);
		
		scan.close();
		
		
	}

}
