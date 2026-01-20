package sms;

import java.sql.*;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/roshan","root","Root");
        System.out.println("Connected!");
        
        System.out.println("1. Insert Student");
        System.out.println("2. Modify Student");
        System.out.println("3. Delete Student");
        System.out.println("4. View Student");
        int choice = sc.nextInt();
        switch(choice) 
        {
        case 1: {
            Student st = new Student();
            st.StudentData();   
            PreparedStatement ps = con.prepareStatement("insert into student (roll,name,age,marks) VALUES (?,?,?,?)");
            ps.setInt(1, st.getRoll());
            ps.setString(2, st.getName());
            ps.setInt(3, st.getAge());
            ps.setDouble(4, st.getMarks());
            ps.executeUpdate();
            System.out.println("inserted Successfully");
            break;
        }

        case 2: {
            System.out.println("Enter existing roll number to update:");
            int roll = sc.nextInt();
            Student st = new Student();
            st.StudentData();    
            PreparedStatement ps = con.prepareStatement("update student SET name=?, age=?, marks=? WHERE roll=?");
            ps.setString(1, st.getName());
            ps.setInt(2, st.getAge());
            ps.setDouble(3, st.getMarks());
            ps.setInt(4, roll);
            ps.executeUpdate();
            System.out.println("modified Succesfully");
            break;
        }
        case 3: {
            System.out.println("Enter roll to delete:");
            int roll = sc.nextInt();
            PreparedStatement ps = con.prepareStatement("delete from student WHERE roll=?");
            ps.setInt(1, roll);
            ps.executeUpdate();
            System.out.println("deleted Succesfully");
            break;
        }
        case 4:
        {
        	Statement st=con.createStatement();
        	ResultSet rs=st.executeQuery("select * from student;");
        	while(rs.next())
        	{
        		System.out.println("roll "+rs.getInt("roll") + " name "+ rs.getString("name")+" age "+rs.getInt("age")+" marks "+rs.getDouble("marks"));
        	}
        	break;
        }
        default : System.out.println("choose right option!!"); break;
        }

        con.close();
    }
}
