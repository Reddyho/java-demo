package controlflow;

import java.util.Scanner;

//program to find greatest of 3 numbers

public class Greatest3 {

	public static void main(String[] args) {
		
        int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("Entere 3 Numbers:");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		if(a>b&&a>c) {
			System.out.println(a+"is greatest");
		}
		else if(b>c && b>a) {
			System.out.println(b+" is greatest");
			
		}
		else if (a==b&&b==c) {
			System.out.println("all are equal");
		}
		else {
			System.out.println(c+" is greatest");
		}
		
		scan.close();
	}

}
