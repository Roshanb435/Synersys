package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {
	
	public String verifyPassword() throws ClassNotFoundException, SQLException{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter password: ");
		String pwd = sc.next();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecom?","root","Root");
		String q = "call verifypass(?);";
		PreparedStatement st = con.prepareStatement(q);
		st.setString(1, pwd);
  		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			if(rs.getObject(1).equals(pwd) && rs.getObject(2).equals(pwd)) {
				return pwd;
			}
			
		}
		return null;
		}


}
