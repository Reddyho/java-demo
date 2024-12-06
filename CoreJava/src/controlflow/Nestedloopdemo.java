package controlflow;

/**
* Author :Koppula.Reddy
* Date   :Oct 25, 2024
* Time   :10:04:25 AM
* email  :Koppula.Reddy@coforge.com
*/

public class Nestedloopdemo {

	public static void main(String[] args) {
/**
		//outer loop
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
		**/
		//outer loop
				for(int i=1;i<=5;i++) {
					//inner loop
					for(int j=1;j<=i;j++) {
						System.out.print("*"+"\t");
					}
					System.out.println();
				}
				System.out.println("---------------------------------");
				
				//outer loop
				for(int i=1;i<=5;i++) {
					//inner loop
					for(int j=5;j>=i;j--) {
						System.out.print("*"+"\t");
					}
					System.out.println();
				}
				System.out.println("---------------------------------");
	}

}
