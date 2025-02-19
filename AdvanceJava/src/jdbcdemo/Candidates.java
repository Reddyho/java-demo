package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Author :Koppula.Reddy
 * Date   :Nov 7, 2024
 * Time   :3:33:33 PM
 * email  :Koppula.Reddy@coforge.com
 */

public class Candidates {
	Connection con=null;
	PreparedStatement pstmt;
	ResultSet rs;

	int cnt=0;
	String sqlUpdate;
	Scanner s;
	int eid;
	String lastname;

	public void getConnections() throws Exception 
	{
		con=ConnectionUtil.createConnection();
	}
	public void UpdateCandidate() throws Exception{
		sqlUpdate="update candidates set last_name=? where id=?";
		pstmt=con.prepareStatement(sqlUpdate);

		// prepare data for update
		s=new Scanner(System.in);
		System.out.println("enter Employee id:");
		eid=s.nextInt();
		System.out.println("enter employee's new last name :");
		lastname=s.next();

		// passing values to prepared statement using setter methods
		pstmt.setString(1, lastname);
		pstmt.setInt(2, eid);

		cnt=pstmt.executeUpdate();
		System.out.println(String.format("Row affected : %d", cnt));

		// reuse the prepared statement
		lastname = "Clinton";
		eid = 101;
		pstmt.setString(1, lastname);
		pstmt.setInt(2, eid);

		cnt = pstmt.executeUpdate();
		System.out.println(String.format("Row affected %d", cnt));
		con.close();
	}

}
