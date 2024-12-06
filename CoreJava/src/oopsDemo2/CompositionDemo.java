package oopsDemo2;

/**
* Author :Koppula.Reddy
* Date   :Oct 29, 2024
* Time   :11:22:20 AM
* email  :Koppula.Reddy@coforge.com
*/

class Hyundai extends Car{
	
	public void hyundaiStart() {
		Engine heng=new Engine();
		heng.startEngine();
		
	}
	
}
class Maruthi extends Car{
	
	public void maruthiStart() {
		Engine meng=new Engine();
		meng.startEngine();
}
}

public class CompositionDemo {
	public static void main(String[] args) {
		Maruthi baleno =new Maruthi();
		
		baleno.setColour("Silver"); //car class methods
		baleno.setMax_Speed(180);	//car class methods
		
		System.out.println("*******Maruti Car Details *********");
		System.out.println(baleno.getColour() +" Color");//car class methods
		System.out.println(baleno.getMax_Speed()+" Speed");//car class methods
		
		baleno.maruthiStart(); // Maruti class method-- > call ENgine class method
		
		baleno=null;//baleno object is destroy ,along with engine
		//System.gc();
		baleno.maruthiStart();
		//System.out.println(baleno.getColour());
	}
	

}
