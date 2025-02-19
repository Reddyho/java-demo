package jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
* Author :Koppula.Reddy
* Date   :Nov 7, 2024
* Time   :12:12:01 PM
* email  :Koppula.Reddy@coforge.com
*/

public class JointDemo {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt;
		ResultSet rs;
		try {
			con=ConnectionUtil.createConnection();
			
			stmt=con.createStatement();
			
			rs=stmt.executeQuery("select c.id,first_name,name from candidates c INNER JOIN candidate_skills s ON c.id=candidate_id  INNER JOIN skills sk ON s.skill_id=sk.id;");
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
