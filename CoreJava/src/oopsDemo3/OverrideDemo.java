package oopsDemo3;

/**
* Author :Koppula.Reddy
* Date   :Oct 29, 2024
* Time   :2:43:24 PM
* email  :Koppula.Reddy@coforge.com
*/

public class OverrideDemo {

	public static void main(String[] args) {

		SBI sbiBank=new SBI("SBI");
		Axis axisBank=new Axis("Axis");
		ICICI iciciBank=new ICICI("ICICI");
		
		sbiBank.display();
		System.out.println("\tthe interest rate is :"+sbiBank.getRateofInterest()+"%");
		iciciBank.display();
		System.out.println("\tthe interest rate is :"+iciciBank.getRateofInterest()+"%");
		axisBank.display();
		System.out.println("\tthe interest rate is :"+axisBank.getRateofInterest()+"%");
	}

}
