package cruddemo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
* Author :Koppula.Reddy
* Date   :Nov 7, 2024
* Time   :12:08:11 PM
* email  :Koppula.Reddy@coforge.com
*/

public class ConnectionUtil {
	
	public static Connection createConnection() throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","cfg@1234");
		return con;
	}
	

}
