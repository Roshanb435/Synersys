package jdbceonnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class Queriesusingps {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
    	Scanner sc=new Scanner(System.in);

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/synersys?";
        String uname = "root";
        String pwd = "Root";

        Connection con = DriverManager.getConnection(url, uname, pwd);
        System.out.println("Connected!");
        //String q="create table dummy(id int , name varchar(30),age int);";
        String q="insert into dummy(id,name,age) values(?,?,?);";
        PreparedStatement ps= con.prepareStatement(q);
        System.out.println("enter id");
        ps.setInt(1,sc.nextInt());
        System.out.println("enter name");
        ps.setString(2, sc.next());
        System.out.println("enter age");
        ps.setInt(3, sc.nextInt());
        ps.executeUpdate();
        

	}

}
