package java8features;

/**
* Author :Koppula.Reddy
* Date   :Nov 9, 2024
* Time   :11:43:14 AM
* email  :Koppula.Reddy@coforge.com
*/

public class DefaultMethodDemo2 {

	public static void main(String[] args) {

		Vehicle car=new Car("BMW");
		
		//invoke overriden methods
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());
		
		//invoke default method
		System.out.println(car.turnAlarmOn());
		System.out.println(car.turnAlarmOff());
		
		//invoke static method
		System.out.println(Vehicle.getHorsePower(2500, 400));
	}

}
