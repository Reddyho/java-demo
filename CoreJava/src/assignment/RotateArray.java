package assignment;

import java.util.Arrays;
import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Nov 4, 2024
* Time   :11:15:01 AM
* email  :Koppula.Reddy@coforge.com
*/

public class RotateArray {

	public static void main(String[] args) {

		int size=0,a;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size :");
		size=sc.nextInt();
		System.out.println("enter the k value :");
		a=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(arr[-1]);
//		for(int j=1;j<=a;j++) {
//			System.out.println(arr[-j]);
//		}
//		
		

	}
}
