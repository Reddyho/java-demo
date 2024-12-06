package arraydemo;

/**
* Author :Koppula.Reddy
* Date   :Nov 6, 2024
* Time   :5:32:27 PM
* email  :Koppula.Reddy@coforge.com
*/

public class fb {
	public static int fab(int n) {
		if(n<=1) {
			return n;
		}
		return fab(n-1)+fab(n-2);
		
	}
	public static void main(String[] args) {
		int t=10;
		for(int i=1;i<=t;i++) {
			System.out.print(fab(i)+" ");
		}
	}

}
