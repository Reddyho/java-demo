package controlflow;

import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Oct 24, 2024
* Time   :3:07:35 PM
* email  :Koppula.Reddy@coforge.com
* 
* Program to find sum of series
*/

public class Sumseries {

	public static void main(String[] args) {

		int a,i=0,sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a limit:");
		a=sc.nextInt();
		
		while(i<=a) {
			sum=sum+i;
			
			i+=1;
		}
		System.out.println("sum of series:"+sum);
		
		sc.close();
	}

}
