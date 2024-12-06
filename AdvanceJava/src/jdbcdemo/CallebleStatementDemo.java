package jdbcdemo;

import java.util.Scanner;

/**
 * Author :Koppula.Reddy
 * Date   :Nov 7, 2024
 * Time   :4:43:59 PM
 * email  :Koppula.Reddy@coforge.com
 */

public class CallebleStatementDemo {

	public static void main(String[] args) {

		try {
			Skills s=new Skills();
			Scanner sc=new Scanner(System.in);

			System.out.println("enter the canditade id:");
			int id=sc.nextInt();

			s.getSkills(id);
			sc.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
