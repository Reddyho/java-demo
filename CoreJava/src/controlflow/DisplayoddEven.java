package controlflow;

import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Oct 24, 2024
* Time   :3:24:15 PM
* email  :Koppula.Reddy@coforge.com
* 
* Program to display Odd & Even numbers in following format
* 
* ODD	EVEN
* ---	----
* 1		2
* 3		4
* 5		6
* 7		8
* 9		10
*/

public class DisplayoddEven {

	public static void main(String[] args) {
		int a=1;
		System.out.println("ODD\tEVEN");
		System.out.println("---\t---");
		
		while (a<=10) {
			if (a%2!=0) {
				System.out.print(a+"\t");
			}
			else {
		    	System.out.println(a);
		    }
		    a+=1;
			
		}

		
	}

}
