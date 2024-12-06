package controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* Author :Koppula.Reddy
* Date   :Oct 24, 2024
* Time   :11:46:23 AM
* email  :Koppula.Reddy@coforge.com
*/

public class Tenarydemo1 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		 int num1,num2,result;
		 InputStreamReader sc=new InputStreamReader(System.in);
		 BufferedReader br=new BufferedReader(sc);

	        System.out.println("Enter 2 Numbers :");
	        num1=Integer.parseInt(br.readLine());
	        num2=Integer.parseInt(br.readLine());
	        
	        
	        
	        
	        String msg=(num1>num2)?"num1 is greatest":"num2 is greatest";
	        System.out.println(msg);
	        
	        result=(num1>num2)?num1:num2;
	        System.out.println(result);
	        

	}

}
