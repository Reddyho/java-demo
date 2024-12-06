package assignment;

import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Oct 24, 2024
* Time   :10:29:48 PM
* email  :Koppula.Reddy@coforge.com
*/

public class SumofDigits {
	public static void main(String[] args) {
		int a,b,s=0,res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digits:");
		a=sc.nextInt();
		b=a;
		while (a>0){
			s=a%10;
			res=res+s;
			a=a/10;
			
	}
		System.out.println("The sum of digits is:"+res);

}
}
