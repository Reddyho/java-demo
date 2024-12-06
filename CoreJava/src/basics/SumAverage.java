package basics;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		int a,b,c,sum;
		float avg;
		Scanner scan=new Scanner(System.in);
		System.out.println("Entere 3 Numbers:");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		sum=a+b+c;
		avg=(float) sum/3;
		
		System.out.println("sum is :"+sum);
		System.out.println("average is :"+avg);
		System.out.println("average"+String.format("%.2f",avg));
		
		scan.close();

	}

}
