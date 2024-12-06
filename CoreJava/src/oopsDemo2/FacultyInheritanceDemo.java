package oopsDemo2;

/**
* Author :Koppula.Reddy
* Date   :Oct 28, 2024
* Time   :11:00:49 AM
* email  :Koppula.Reddy@coforge.com
*/

public class FacultyInheritanceDemo {

	public static void main(String[] args) {

		ScienceFaculty faculty;
		faculty=new ScienceFaculty("dr.arjun reddy", "F123", 9000, "technology", "genitcs",5000);
		
		faculty.displayDetails();
	}

}
