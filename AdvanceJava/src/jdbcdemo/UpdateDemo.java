package jdbcdemo;

/**
 * Author :Koppula.Reddy
 * Date   :Nov 7, 2024
 * Time   :3:33:11 PM
 * email  :Koppula.Reddy@coforge.com
 */

public class UpdateDemo {

	public static void main(String[] args) {

		Candidates c1=new Candidates();
		try {
			c1.getConnections();
			c1.UpdateCandidate();
		}
		catch (Exception e) {
			System.out.println(e);		
		}
	}

}
