package oopsdemo4;

/**
* Author :Koppula.Reddy
* Date   :Oct 30, 2024
* Time   :11:32:35 AM
* email  :Koppula.Reddy@coforge.com
*/

public abstract class Traning {
	private String name;
	private String address;
	private int number;
	
	public Traning(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Traning [name=" + name + ", address=" + address + ", number=" + number + "]";
	}
	public abstract double calcuateMarks();
		
	
	

}
