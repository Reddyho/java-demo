package controlflow;

import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Oct 24, 2024
* Time   :3:15:54 PM
* email  :Koppula.Reddy@coforge.com
*/

public class Multiplucation {

	public static void main(String[] args) {

		int a,i=1,mul;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a limit:");
		a=sc.nextInt();
		
		
		while (i<=10) {
			mul=i*a;
			System.out.println(mul);
			i+=1;
		}
		sc.close();
		
	}

}
