package controlflow;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 25, 2024
 * Time   :11:45:12 AM
 * email  :Koppula.Reddy@coforge.com
 */

public class Nestedloopdem02 {

	public static void main(String[] args) {

		int weeks =4,days=7;
		int i =1;

		//Outer loop
		while (i<=weeks) {                          // 1 2 3 4  -4
			System.out.println("Week : "+i);

			//Inner Loop
			for (int j = 1; j <=days; j++) {
				System.out.println("\tDay : "+j);   // 7 7 7 7 - 28
			}
			i=i+1;
		}
	}

}
