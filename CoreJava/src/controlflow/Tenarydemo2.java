package controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 24, 2024
 * Time   :11:58:35 AM
 * email  :Koppula.Reddy@coforge.com
 */

public class Tenarydemo2 {

	public static void main(String[] args) throws IOException {

		char myChar;
		InputStreamReader s=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(s);
		//Scanner scanner=new Scanner(System.in);

		System.out.println("Enter a Character :");
		myChar = br.readLine().charAt(0); //Character I/p

		//Ternary Operator to check Simple Conditions
		String msg =(myChar >= 'a' && myChar <='z' || myChar >= 'A' && myChar <='Z' ) ?
				myChar+" is an Alphabet": myChar+" not an Alphabet";

		System.out.println(msg);
	}

}
