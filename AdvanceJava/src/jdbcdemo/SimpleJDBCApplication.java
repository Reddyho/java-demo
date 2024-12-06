package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
* Author :Koppula.Reddy
* Date   :Nov 7, 2024
* Time   :10:50:07 AM
* email  :Koppula.Reddy@coforge.com
*/

public class SimpleJDBCApplication {

	public static void main(String[] args) {

		try {
			//load the jdbc drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//estblish the connection
			String url="jdbc:mysql://localhost:3306/classicmodels";
			String username ="root";
			String password ="cfg@1234";
			Connection cn=DriverManager.getConnection(url,username,password);
			
			//excute the query
			Statement st=cn.createStatement();
			 String sql ="Select*FROM employees";
			 ResultSet rs=st.executeQuery(sql);
			 
			 System.out.println("employeee number\t first name \t designation ");
			 //process the result
			 while(rs.next()) {
				 int id = rs.getInt("employeeNumber");
				 String name =rs.getString("firstName");
				
				 System.out.println(id+"\t\t\t"+name+"\t\t"+rs.getString(8));
				
		}
			 //close resources
			 rs.close();
			 st.close();
			 cn.close();
		
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
