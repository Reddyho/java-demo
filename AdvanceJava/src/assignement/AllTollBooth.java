package assignement;

/**
 * Author :Koppula.Reddy
 * Date   :Nov 10, 2024
 * Time   :4:52:42 PM
 * email  :Koppula.Reddy@coforge.com
 */

public class AllTollBooth implements ToolBooth {
	private int totalTrucks;
	private int totalReceipts;
	@Override
	public void calculateToll(Truck t1) {
		double toll = 5 * t1.getAxles() + 10 * (t1.getWeight() / 500);
		totalReceipts += toll;
		totalTrucks+=1;
		System.out.println("Arrival of " + t1.getbrand() + " Truck");
		System.out.println("Truck arrival - Axles: " + t1.getAxles() + " Total weight: " + t1.getWeight() + " Toll due: $" + toll);

	}
	@Override
	public void displayData() {
		System.out.println("Totals since last collection - Receipts: $" + totalReceipts + " Trucks: " + totalTrucks);
	}


	@Override
	public void collectReceipts() {
		System.out.println("*** Collecting receipts ***");
		displayData();
		totalReceipts = 0;
		totalTrucks = 0;
		System.out.println("***** Reset Receipts *****");
		displayData();

	}

}
