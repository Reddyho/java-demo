package controlflow;

import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Oct 25, 2024
* Time   :9:19:27 AM
* email  :Koppula.Reddy@coforge.com
*/

public class Volwelscheck {
	
	//program to check volwels

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String name;
		int count=0;
		System.out.println("Enter name:");
		name=sc.nextLine();
		
		String na=name.toLowerCase();
		
		for(int i=0;i<name.length();i++) {
			if(na.charAt(i)=='a'||na.charAt(i)=='e'||na.charAt(i)=='i'||na.charAt(i)=='o'||na.charAt(i)=='u') {
				count+=1;
			}
		}
		System.out.println("total volwels is:"+count);
	}

}
