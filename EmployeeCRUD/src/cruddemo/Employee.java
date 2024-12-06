package cruddemo;

import java.sql.*;
import java.util.Scanner;

//import jdbcdemo.ConnectionUtil;

/**
 * Author :Koppula.Reddy
 * Date   :Nov 7, 2024
 * Time   :5:11:26 PM
 * email  :Koppula.Reddy@coforge.com
 */

//employee class to implement crud operations
public class Employee {
	Connection con;
	PreparedStatement ps;
	Statement st;
	ResultSet rs;

	public Connection getConnection()
	{
		 try {
	            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "cfg@1234");
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	        return con;
	}

	public void insertEmployee(String e_name, String e_city, String e_contact,String e_mail)
	{
		try {
            con = getConnection();
            String query = "INSERT INTO employee (e_name, e_city, e_contact,e_mail) VALUES (?, ?, ?, ?)";
            ps = con.prepareStatement(query);
            ps.setString(1, e_name);
            ps.setString(2, e_city);
            ps.setString(3, e_contact);
            ps.setString(4, e_mail);
            ps.executeUpdate();
            System.out.println("** Employee Inserted **");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

	}

	public void getEmployee()
	{
		try {
            con = getConnection();
            String query = "SELECT * FROM employee";
            st = con.createStatement();
            rs = st.executeQuery(query);
            System.out.println("** Display Employees **");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("e_id") + ", Name: " + rs.getString("e_name") +
                                   ", City: " + rs.getString("e_city") + ", Contact: " + rs.getString("e_contact")+", Email id:"+rs.getString("e_mail"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
	}

	public void updateEmployee(int e_id,String e_city)
	{
		try {
            con = getConnection();
            String query = "UPDATE employee SET e_city = ? WHERE e_id = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, e_city);
            ps.setInt(2, e_id);
            ps.executeUpdate();
            System.out.println("** Employee Updated **");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
	}
	public void updateemail(int e_id,String e_mail) {
		try {
			con=getConnection();
			String q="update employee set e_mail=? where e_id=?";
			ps=con.prepareStatement(q);
			 ps.setString(1, e_mail);
	            ps.setInt(2, e_id);
	            ps.executeUpdate();
	            System.out.println("** Employee Updated **");
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteEmployee(int e_id)
	{
		try {
            con = getConnection();
            String query = "DELETE FROM employee WHERE e_id = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, e_id);
            ps.executeUpdate();
            System.out.println("** Employee Deleted **");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
	}


	
}



