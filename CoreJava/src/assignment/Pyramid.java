package assignment;

import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Nov 4, 2024
* Time   :10:16:51 AM
* email  :Koppula.Reddy@coforge.com
*/

public class Pyramid {

	public static void main(String[] args) {

		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			for (int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++) {
				System.out.print(k);
			}
			for(int a=1;a<i;a++) {
				System.out.print(a);
			}
			System.out.println();
			
		}
		sc.close();

	}

}
