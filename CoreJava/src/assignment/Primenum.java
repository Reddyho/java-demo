package assignment;

import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Oct 24, 2024
* Time   :10:03:43 PM
* email  :Koppula.Reddy@coforge.com
*/

    public class Primenum {

	public static void main(String[] args) {

		int a,i;
		boolean is=true;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Numbers:");
		a=scan.nextInt();
		for(i=2;i<a;i++) {
			if (a%i==0) {
				is=false;
				break;
			}
		}
			if(is) {
				System.out.println("prime");
				
			
		}
			else {
				System.out.println("not prime");
			}
		
			
		}
	}


