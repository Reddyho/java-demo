package packagedemo;

import com.coforge.traning.microsoft.OperatingSystem;
import com.coforge.traning.oracle.*;
/**
* Author :Koppula.Reddy
* Date   :Nov 4, 2024
* Time   :3:13:29 PM
* email  :Koppula.Reddy@coforge.com
*/

public class SoftwareList {

	public static void main(String[] args) {


		dataBase db1=new dataBase();
		OperatingSystem os1=new OperatingSystem();
		
		
		System.out.println("***********Database Software*************");
		db1.printSoftware();
		
		System.out.println("**********operating system***************");
		os1.listSoftware();
	}

}
