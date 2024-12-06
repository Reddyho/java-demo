package jdbcdemo;

import java.sql.*;

/**
* Author :Koppula.Reddy
* Date   :Nov 7, 2024
* Time   :12:12:22 PM
* email  :Koppula.Reddy@coforge.com
*/

//demonstrate projection
public class SelectDemo1 {

	public static void main(String[] args) {

		Connection con=null;
		Statement stmt;
		ResultSet rs;
		
		try {
			con=ConnectionUtil.createConnection();
			
			stmt=con.createStatement();
			
			rs=stmt.executeQuery("select first_name,last_name,email from candidates");
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString("last_name")+"\t"+rs.getString("email"));
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
