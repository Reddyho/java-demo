package CollectionsDemo;

/**
* Author :Koppula.Reddy
* Date   :Nov 6, 2024
* Time   :12:01:01 PM
* email  :Koppula.Reddy@coforge.com
*/

public class Students implements Comparable<Students> {

	private int rollNo;
	private String name;
	private int age;
	
	
	public Students(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}


	public int getRollNo() {
		return rollNo;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	@Override
	public int compareTo(Students o) {

		if(age==o.age)
			return 0;
		else if (age>o.age)
			return 1;
		else
			return -1;
	
	}
	
}
