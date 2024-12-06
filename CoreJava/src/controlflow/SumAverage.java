package controlflow;

import java.util.Scanner;

/*
 * program to find sum and avg if 3 numbers are>100
 */
public class SumAverage {

	public static void main(String[] args) {
		int a,b,c,sum;
		float avg;
		
		//take input from user command
		Scanner scan=new Scanner(System.in);
		System.out.println("Entere 3 Numbers:");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		if(a>100 && b>100 && c>100) {
			sum=a+b+c;
			avg=(float) sum/3;
			System.out.println("sum is :"+sum);
			System.out.println("average is :"+avg);
			System.out.println("average"+String.format("%.2f",avg));
		}
		else {
			System.out.println("please enter greater than 100");
		}
		
		
		
		
	
		
		scan.close();

	}

}
