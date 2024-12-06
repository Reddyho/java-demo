package oopsdemo4;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 30, 2024
 * Time   :11:49:11 AM
 * email  :Koppula.Reddy@coforge.com
 */

public class Manager extends Employee {
	private String departement;

	public Manager(String name, double basic, String address,String departement) {
		super(name, basic, address);
		this.departement=departement;
	}

	@Override
	double totalPay() {
		double totalAmount = 0;
		double houseRentAllowance = (basic * 0.08);
		double dearnessAllowance = (basic * 0.3);
		double medicalAllowance = 1500;
		totalAmount = basic + houseRentAllowance
				+ dearnessAllowance + medicalAllowance;
		return totalAmount;
	}
	   void show() {
			super.show();
			System.out.println("Department: \t\t" + departement);
		}

}
