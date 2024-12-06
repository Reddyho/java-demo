package assignment;

import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Oct 24, 2024
* Time   :9:59:07 PM
* email  :Koppula.Reddy@coforge.com
*/

public class Reversenum {

	public static void main(String[] args) {

		int a,b,s=0,res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		a=sc.nextInt();
		b=a;
		while (a>0){
			s=a%10;
			res=res*10+s;
			a=a/10;//125--12
		}
		System.out.println("the reverse number:"+res);
	}

}
