package cruddemo;
import java.util.Scanner;

/**
* Author :Koppula.Reddy
* Date   :Nov 7, 2024
* Time   :5:17:16 PM
* email  :Koppula.Reddy@coforge.com
*/

public class EmployeeCRUDDemo{
	 
	public static void main(String[] args) {
		Employee e=new Employee();
		String e_city=null,e_name=null,e_contactno=null,e_mail=null;
		int cid=0;;
 
		System.out.println("************** Coforge  **************");
		System.out.println("----------- Employee Management System ----------");
		while(true)
		{
			System.out.println("Press 1 for New Employee \t Press 2 to Display Employees");
			System.out.println("Press 3 for Update Employee \t Press 4 to Delete Employee");
			System.out.println("Press 5 to update email using result set .\t press 6 for Exit");
 
			Scanner s=new Scanner(System.in);
			int option=s.nextInt();
 
			switch(option)
			{
			case 1: System.out.println("Enter Employee Name: ");
			        e_name = s.next();
			        System.out.println("Enter City: ");
			        e_city = s.next();
			        System.out.println("Enter Contact No: ");
			        e_contactno = s.next();
			        System.out.println("enter email id");
			        e_mail=s.next();
			        e.insertEmployee(e_name, e_city, e_contactno,e_mail);
			        break;
			
 
			case 2: e.getEmployee();
			        break;
 
			case 3: System.out.println("Enter Employee ID to Update: ");
                    cid= s.nextInt();
                    s.nextLine();
                    System.out.println("Enter New City: ");
                    e_city = s.nextLine();
                    e.updateEmployee(cid, e_city);
                    break;
 
			case 4: System.out.println("Enter Employee Id  to be Deleted:");
			        cid = s.nextInt();
			        e.deleteEmployee(cid);
			        break;
			case 5:System.out.println("enter the employee id to update the mail:");
			        cid=s.nextInt();
			        System.out.println("enter the new email:");
			       e_mail=s.next();
			       e.updateemail(cid, e_mail);
			       break;
			       
			case 6: System.out.println("Program Terminated");
			        s.close();
			        System.exit(0);
 
			default: System.out.println("Invalid Selection");
			         break;
 
			}
		}
	}
}