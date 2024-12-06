package controlflow;

/**
* Author :Koppula.Reddy
* Date   :Oct 25, 2024
* Time   :9:48:05 AM
* email  :Koppula.Reddy@coforge.com
*/

public class Jumpdemo {
	//program to demonstrate break&countinue

	public static void main(String[] args) {

		int i;
		System.out.println("......Break statement.....");
		for ( i = 1; i < 11; i++) {
			if (i==5){
				break;
			}
			System.out.print(i+"\t");
		}
			
	
		System.out.println("\t");
		System.out.println("......continue statement......");
		
		for (i = 10; i > 0; i--) {
			if(i>4&&i<9) {
				continue;
			}
			System.out.print(i+"\t");
	}

}
}
