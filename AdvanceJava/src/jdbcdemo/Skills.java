package jdbcdemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
* Author :Koppula.Reddy
* Date   :Nov 7, 2024
* Time   :4:44:11 PM
* email  :Koppula.Reddy@coforge.com
*/

public class Skills {
	Connection con=null;
	CallableStatement cstmt;
	ResultSet rs;
	
	int id;

	public Skills() throws Exception{
		con=ConnectionUtil.createConnection();
	}
	
	public void getSkills(int candidateId)throws Exception {
		//calling stored procudure with single parameter
		cstmt=con.prepareCall("{call get_candidate_skill(?) }");
		cstmt.setInt(1, candidateId);
		rs=cstmt.executeQuery();
		
		// Check if the ResultSet is empty
	    if (!rs.next()) {
	        System.out.println("No Skills");
	    } else {
	        // If there is data, process it
	        do {
	            System.out.println(String.format("%s - %s",
	                    rs.getString("first_name") + " "
	                    + rs.getString("last_name"),
	                    rs.getString("skill")));
	        } while (rs.next());
	    }
		
//		while (rs.next()) {
//            System.out.println(String.format("%s - %s",
//                    rs.getString("first_name") + " "
//                    + rs.getString("last_name"),
//                    rs.getString("skill")));
//				}
		con.close();
	}

}
