package ecommerce;

import java.sql.*;
import java.util.Scanner;

public class Authorization {

    Scanner sc = new Scanner(System.in);

    public void verify() throws Exception {

        System.out.println("Enter Name:");
        String name = sc.next();

        System.out.println("Enter Password:");
        String password = sc.next();

        loginOrRegister(name, password);
    }

    public void loginOrRegister(String name, String password) throws Exception {

        Connection con = DBConnection.getConnection();

        PreparedStatement ps = con.prepareStatement("SELECT * FROM user WHERE name=? AND password=?");

        ps.setString(1, name);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            System.out.println("\nLogin Successful! Welcome " + rs.getString("name") + "\n");
            Shop.showProducts();
            return;
        }
        PreparedStatement ps2 = con.prepareStatement("SELECT * FROM user WHERE name=?");

        ps2.setString(1, name);

        ResultSet rs2 = ps2.executeQuery();

        if (rs2.next()) {
            System.out.println("\nUser already exists with this name but password is incorrect.\n");
            con.close();
            return;
        }
        
        System.out.println("\nNo account found. Please register.\n");

        System.out.println("Enter Email:");
        String email = sc.next();

        System.out.println("Enter Gender (M/F):");
        char gender = sc.next().charAt(0);

        System.out.println("Enter Contact Number:");
        long contact = sc.nextLong();

        User user = new User(name, password, email, gender, contact);

        PreparedStatement ps3 = con.prepareStatement("INSERT INTO user(name,password,email,gender,contact) VALUES(?,?,?,?,?)");

        ps3.setString(1, user.getName());
        ps3.setString(2, user.getPassword());
        ps3.setString(3, user.getEmail());
        ps3.setString(4, String.valueOf(user.getGender()));
        ps3.setLong(5, user.getContact());

        ps3.executeUpdate();

        con.close();

        System.out.println("\nRegistration Successful! Welcome " + user.getName() + "\n");

        Shop.showProducts();
    }
}
