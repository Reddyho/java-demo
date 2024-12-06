package controlflow;

import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Oct 24, 2024
* Time   :4:30:38 PM
* email  :Koppula.Reddy@coforge.com
* 
* Code to create Simple Online Shopping App .
 Use do-while loop to repeatedly prompt the user for actions until they choose to exit
*/

public class ShoppingApp {

	public static void main(String[] args) {

		String userInput=null;
		Scanner scan=new Scanner(System.in);
		
		do {
			System.out.println("Welcome to our online shopping");
			System.out.println("1. view product");
			System.out.println("2. add product");
			System.out.println("3.Check out");
			System.out.println("Exit");
			
			System.out.println("Enter your choice");
			int choice= scan.nextInt();
			
			switch (choice) {
			case 1:
			System.out.println("Display product.......");
			break;
			case 2:
			System.out.println("Adding Product.......");
			break;
			case 3:
				System.out.println("Checking out.......");
			break;
			case 4:
				System.out.println("ec]xciting application");
				return;
			default:
				System.out.println("invalid choice");
			}
			System.out.println("do you want to continue shoping?(yes/no) :");
			userInput=scan.next();
			
			
		}while(userInput.equalsIgnoreCase("yes"));
		System.out.println("thanks for shopping with us!!");
		scan.close();
		
	}

}
