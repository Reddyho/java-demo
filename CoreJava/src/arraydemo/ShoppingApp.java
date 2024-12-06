package arraydemo;

import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Oct 24, 2024
* Time   :4:30:38 PM
* email  :Koppula.Reddy@coforge.com
* 
* Code to create Simple Online Shopping App to View,Add & Check out Products.
 Use do-while loop to repeatedly prompt the user for actions until they choose to exit
*/

public class ShoppingApp {

	public static void main(String[] args) {

		String userInput=null;
		Scanner scan=new Scanner(System.in);
		
		String[] products= {"logitech","boat earbuds","hp gaming laptop",
				"i phone","hp printer","philips lights"};
		String[] cart=new String[products.length];
		int cartIndex=0;
		
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
			for(int i=0;i<products.length;i++) {
				System.out.println((i+1)+". "+products[i]);
				//for(String s:products) {
					//System.out.println(s);
				//}
			}
			break;
			case 2:
			System.out.println("Adding Product.......");
			System.out.println("Enter the product name of cart:");
			int pno=scan.nextInt();
			if(pno>0&& pno<=products.length) {
				cart[cartIndex++]=products[pno-1];
				System.out.println("product added to cart");
			}
			else {
				System.out.println("invalid product number");
			}
			break;
			case 3:
				System.out.println("Checking out.......");
				for(int i=0;i<cartIndex;i++) {
					System.out.println((i+1)+". "+cart[1]);
				}
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
