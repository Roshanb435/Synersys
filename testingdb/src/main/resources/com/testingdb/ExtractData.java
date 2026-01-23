package com.testingdb;

import java.sql.*;


public class ExtractData 
{
	public static void getData(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecom?","root","Root");
		Statement st=con.createStatement();
		ResultSet rs = st.executeQuery("select * from user;");
		while(rs.next())
		{
			System.out.println(rs.getObject(1));
		}

	}
}
