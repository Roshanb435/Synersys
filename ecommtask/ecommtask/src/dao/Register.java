package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Register {
	public String registeruser() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/ecom?",
				"root",
				"Root");
		String q = "call registeruser(?,?,?,?,?,?);";
		PreparedStatement st = con.prepareStatement(q);
		System.out.println("enter user name");
		String name=sc.next();
		System.out.println("enter mail");
		String mail=sc.next();
		System.out.println("enter contact");
		long contact=sc.nextLong();
		System.out.println("enter password");
		String password=sc.next();
		System.out.println("enter confirm password");
		String confirmpassword=sc.next();
		if(password!=confirmpassword)
		{
			System.out.println("password is not same enter confirmpassword again");
			confirmpassword=sc.next();
		}
		System.out.println("enter gender");
		String gender=sc.next();
		st.setString(1, name);
		st.setString(2, mail);
		st.setLong(3, contact);
		st.setString(4, password);
		st.setString(5, confirmpassword);
		st.setString(6,gender);
		st.executeUpdate();
		System.out.println("user registered succesfully");
		return "";
		
		
	}
	

}
