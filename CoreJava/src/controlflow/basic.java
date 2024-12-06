package controlflow;

import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Oct 24, 2024
* Time   :6:44:07 PM
* email  :Koppula.Reddy@coforge.com
*/

public class basic {

	public static void main(String[] args) {
		/**int a,b,s=0,res=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=a;
		while (a>0){
			s=a%10;
			res=res*10+s;
			a=a/10;//125--12
		}
		if(b==res) {
		System.out.println("is palandrome");
		}
		else {
			System.out.println("not palandrome");
		}
		**/
		int a,b,i=1,s;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		while(i<=b) {
			s=a*i;
			System.out.println(a+"*"+i+"="+s);
			i++;
		}

	}

}
