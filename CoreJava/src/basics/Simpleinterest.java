package basics;

import java.util.Scanner;

public class Simpleinterest {

	public static void main(String[] args) {

		String name;
		double principle;
		float si;
		int term,rate;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("coustmer name:");
		name=scan.nextLine();
		System.out.println("enter loan amount:");
		principle=scan.nextDouble();
		System.out.println("enter loan term:");
		term=scan.nextInt();
		System.out.println("enter rate of interst:");
		rate=scan.nextInt();
		
		si=(float)(principle*term*rate)/100;
		
		
		System.out.println("coustomer name:"+name);
		System.out.println("principle amount"+principle);
		System.out.println("term"+term);
		System.out.println("rate"+rate);
		System.out.println("total"+si);
		
		scan.close();
		
	}

}
