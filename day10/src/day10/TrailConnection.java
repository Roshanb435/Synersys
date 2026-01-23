package day10;

import java.sql.*;

public class TrailConnection {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/synersys?";
        String uname = "root";
        String pwd = "Root";

        Connection con = DriverManager.getConnection(url, uname, pwd);
        System.out.println("Connected!");
        Statement st=con.createStatement();
        
        /*boolean b=st.execute("create table demo(id int,name varchar(25),age int);");
        System.out.println(" "+b);*/
        
        /*boolean c = st.execute(
        "insert into demo(id,name,age) values (1,'roshan',23),(1,'roshan',23),(1,'roshan',23),(1,'roshan',23),(1,'roshan',23),(1,'roshan',23);"
    );
    	System.out.println(" "+c);*/
        
        
       /* boolean d=st.execute("delete from demo where id=1;");
        	System.out.println(d); */
 
        
       /* boolean e= st.execute("truncate table demo;");
        System.out.println(e);*/
        
        boolean f=st.execute("drop table demo;");
        System.out.println(f);
        

        con.close();
    }
}
