package assignment;

import java.util.Scanner;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 24, 2024
 * Time   :9:32:29 PM
 * email  :Koppula.Reddy@coforge.com
 */

public class Score {

	public static void main(String[] args) {

		int a;
		String r;

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the score:");
		a=scan.nextInt();
		if(100>a&&a>90) {
			r="A";
		}
		else if(89>a&&a>80) {
			r="B";
		}
		else if(79>a&&a>70) {
			r="C";
		}
		else if(69>a&&a>60) {
			r="D";
		}
		else {
			r="Fail";
		}
		System.out.println("Your grade is:"+r);
		scan.close();
	}

}
