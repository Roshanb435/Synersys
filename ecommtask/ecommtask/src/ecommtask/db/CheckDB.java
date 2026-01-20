package ecommtask.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckDB {
	
	public String verifyUserName(String uname) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/ecom?",
				"root",
				"Root");
		String q = "call verifyuser(?);";
		PreparedStatement st = con.prepareStatement(q);
		st.setString(1, uname);
  		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			if(rs.getObject(1).equals(uname) || rs.getObject(2).equals(uname)) {
				return uname;
			}
			
		}
		return null;
				
		
	}

}
