package com.testingdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ExtractData 
{
	public List<String> getData() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecom?","root","Root");
		Statement st=con.createStatement();
		ResultSet rs = st.executeQuery("select * from user;");
		List<String> users=new ArrayList<>();
		while(rs.next())
		{
			users.add(rs.getString(1));
		}
		return users;
	}
}
