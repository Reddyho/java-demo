package jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Author :Koppula.Reddy
 * Date   :Nov 7, 2024
 * Time   :2:59:42 PM
 * email  :Koppula.Reddy@coforge.com
 */

public class InsertDemo {

	public static void main(String[] args) {

		Connection con=null;
		Statement stmt;
		ResultSet rs;
		int count;
		try {
			con=ConnectionUtil.createConnection();
			String str="insert into skills(name) values ('Node js')";
			stmt=con.createStatement();

			count=stmt.executeUpdate(str);
			if(count>0) {
				System.out.println("record inserted");
			}
			String str1="select count(id) from skills";
			rs=stmt.executeQuery(str1);
			int cnt=0;
			while(rs.next()) {
				cnt=rs.getInt(1);
			}
			System.out.println("total no.of records is:"+cnt);
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
