package exceptiondemo;

/**
 * Author :Koppula.Reddy
 * Date   :Nov 6, 2024
 * Time   :3:33:45 PM
 * email  :Koppula.Reddy@coforge.com
 */

public class ThrowDemo2 {
	public static void checkEligibility(int age,int weight)
	{
		if(age < 12 || weight <40)
		{
			throw new ArithmeticException("Student is Not Eligible for Registration");
		}
		else
		{
			System.out.println("Student with age :"+age+ " and with Weight "+weight+" is Eligible");
		}
	}


	public static void main(String[] args) {

		System.out.println("Welcome to Sports Eligibility Process..");
		checkEligibility(20,45);
		System.out.println("Thank You");
		checkEligibility(10,44);


	}

}
