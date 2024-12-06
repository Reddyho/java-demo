package assignment;

import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Oct 24, 2024
* Time   :9:29:42 PM
* email  :Koppula.Reddy@coforge.com
*/

public class Itcity {

	public static void main(String[] args) {



		String city;
		Scanner s=new Scanner(System.in);

		System.out.println("Enter a City Name : ");
		city=s.next();
		if(city.equalsIgnoreCase("Bengaluru") || city.equalsIgnoreCase("Chennai") || 
				city.equalsIgnoreCase("hyderabad") || city.equalsIgnoreCase("Gurgaon")) 
		{
			System.out.println(city+" is a IT City");
		}
		else
		{
			System.out.println(city+" is Not a IT City");
		}
		
	}

}
