package assignement;

/**
* Author :Koppula.Reddy
* Date   :Nov 10, 2024
* Time   :4:50:12 PM
* email  :Koppula.Reddy@coforge.com
*/

public class DaewooTruck implements Truck{
	private  int axles;
    private  int weight;
    
	public DaewooTruck(int axles, int weight) {
		this.axles = axles;
		this.weight = weight;
	}

	@Override
	public int getAxles() {
		// TODO Auto-generated method stub
		return axles;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public String getbrand() {
		// TODO Auto-generated method stub
		return "DaewooTruck";
	}
    
    

}
