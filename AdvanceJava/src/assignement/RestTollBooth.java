package assignement;

/**
* Author :Koppula.Reddy
* Date   :Nov 10, 2024
* Time   :5:06:35 PM
* email  :Koppula.Reddy@coforge.com
*/

public class RestTollBooth {

	public static void main(String[] args) {

ToolBooth booth = new AllTollBooth();
        
        Truck ford = new FordTruck(5, 12500);   
        Truck nissan = new NissanTruck(2, 5000); 
        Truck daewoo = new DaewooTruck(6, 17000);
        
        booth.calculateToll(ford);
        booth.calculateToll(nissan);
        booth.calculateToll(daewoo);
        
        booth.collectReceipts();
	}

}
