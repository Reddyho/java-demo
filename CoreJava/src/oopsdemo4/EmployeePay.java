package oopsdemo4;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 30, 2024
 * Time   :11:56:22 AM
 * email  :Koppula.Reddy@coforge.com
 *  Calculate total pay for Manager & Directors using abstraction
 */

public class EmployeePay {

	public static void main(String[] args) {


		Employee mgrObj = new Manager("Honey", 5500.65, "Sydney", "Accounts");

		double payTotal = mgrObj.totalPay();
		double less = mgrObj.deduction(5); // has take 5 leaves
		double netPay = payTotal - less;
		System.out.println("\nManager Details");
		System.out.println("===================================");
		mgrObj.show();
		System.out.println("Total Pay: \t\t" + payTotal);
		System.out.println("Net Pay: \t\t" + netPay);

		Employee dirObj = new Director("Stephen", 32400.00, "New York",8000);
		payTotal = dirObj.totalPay();
		less = dirObj.deduction(1);
		netPay = payTotal - less;
		System.out.println("\n\nDirector Details");
		System.out.println("============================");
		dirObj.show();
		System.out.println("Total Pay: \t\t" + payTotal);
		System.out.println("Net Pay: \t\t" + netPay);

		// Employee e1=new Employee(); -- compiler error - cannot instantiate abstract class Employee
	}

}
