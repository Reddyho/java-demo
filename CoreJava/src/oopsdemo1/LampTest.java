package oopsdemo1;

/**
 * Author :Koppula.Reddy
 * Date   :Oct 26, 2024
 * Time   :11:48:31 AM
 * email  :Koppula.Reddy@coforge.com
 */

class Lamp{


	//Stores status of Lamp
	private boolean isOn;

	//Default Constructor - 
	//Compiler Creates it for Automatic initialization of Object Properties

	//Method to turn On the Lamp
	public void turnOn() {
		isOn=true;
		System.out.println("Light On ? : "+isOn);
	}
	//Method to turn Off the Lamp
	public void turnOff() {
		isOn=false;
		System.out.println("Light On ? : "+isOn);
	}
}

//main class - File should be saved as LampTest - The Main class name
public class LampTest {
	public static void main(String[] args) {
		Lamp led=new Lamp();
		Lamp halogen=new Lamp();
		
		//switch on
		led.turnOn();
		halogen.turnOn();
		
		//switch off
		led.turnOff();
		halogen.turnOff();
	}

}

