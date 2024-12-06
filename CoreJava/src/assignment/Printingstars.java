package assignment;

/**
* Author :Koppula.Reddy
* Date   :Oct 26, 2024
* Time   :9:24:49 AM
* email  :Koppula.Reddy@coforge.com
*/

public class Printingstars {

	public static void main(String[] args) {

		//outer loop
		for(int i=1;i<=5;i++) {
			//inner loop
			for(int j=1;j<=i;j++) {
				System.out.print("*"+"\t");
			}
			
			System.out.println();
		}
		
	
		
		//outer loop
		for(int i=1;i<=5;i++) {
			//inner loop
			for(int j=4;j>=i;j--) {
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
	}

}
