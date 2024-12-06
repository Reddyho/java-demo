package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Author :Koppula.Reddy
 * Date   :Nov 7, 2024
 * Time   :4:17:46 PM
 * email  :Koppula.Reddy@coforge.com
 */

public class DeleteDemo {

	public static void main(String[] args) {

		Connection con=null;
		Statement stmt;
		int cnt=0;

		try {
			con=ConnectionUtil.createConnection();
			String sql="delete from candidates where rtrim(last_name)"+"like\'k%g';";
			String sql1="delete from candidates where id=101;";

			stmt=con.createStatement();
			cnt=stmt.executeUpdate(sql1);

			if(cnt>0) {
				System.out.println("record deleted");
			}
			else {
				System.out.println("record not found");
			}
			con.close();
		}
		catch (Exception e) {
			System.out.println(e);		
		}
	}

}
