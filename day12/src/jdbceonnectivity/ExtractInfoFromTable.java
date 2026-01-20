package jdbceonnectivity;

import java.sql.*;


public class ExtractInfoFromTable {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/synersys?";
        String uname = "root";
        String pwd = "Root";

        Connection con = DriverManager.getConnection(url, uname, pwd);
        System.out.println("Connected!");
        Statement st=con.createStatement();
        
        ResultSet rs=st.executeQuery("select * from doctors;");
        System.out.println(rs);
        while(rs.next())
        {
        	int i=rs.getInt("id");
        	String dr=rs.getString("drname");
        	
        	System.out.println("id "+ i + " drname "+dr);
        	
        	System.out.println(rs.getObject(1));
        	System.out.println(rs.getObject(2));
        	System.out.println(rs.getObject(3));
        	
        	
        }
        
        

	}
}

