package com.testingdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExtractUser {

    public boolean nameExists(String uname) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecom", "root", "Root"); 
        PreparedStatement ps = con.prepareStatement("select 1 from user where uname = ? limit 1;");
        ps.setString(1, uname);
        ResultSet rs = ps.executeQuery();
        boolean exists = rs.next();
        return exists;
    }
}
