package oopsDemo2;

/**
* Author :Koppula.Reddy
* Date   :Oct 28, 2024
* Time   :10:50:21 AM
* email  :Koppula.Reddy@coforge.com
*/

public class ScienceFaculty extends Faculty  {
	private String department;
	private String researchArea;
	private double bonus;
	
	public ScienceFaculty(String name, String facultyId, double salary,
			String department,String researchArea,double bonus)
	{
		super(name, facultyId, salary);
		this.department=department;
		this.researchArea=researchArea;
		this.bonus=bonus;
	}
	
    public void displayDetails() {
        super.displayDetails(); // Call the displayDetails method of the superclass
        System.out.println("Department: " + department);
        System.out.println("Research Area: " + researchArea);
        System.out.println("Bonus: $" + bonus);
    }

}
