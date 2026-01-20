package jdbceonnectivity;

import java.sql.*;

public class Update {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/synersys?";
        String uname = "root";
        String pwd = "Root";

        Connection con = DriverManager.getConnection(url, uname, pwd);
        System.out.println("Connected!");
        Statement st=con.createStatement();
        st.execute("alter table doctors drop column ageofdoctor;");
       
	}

}
