package driverclass;

import java.util.Scanner;

import buyproducts.AddtoCart;
import dao.Login;
import dao.Register;
import ecommtask.db.CheckDB;
import products.AddProducts;

 
public class Driver {
	
	public static void adminLogin() throws Exception{
		new AddProducts().addToDB();
	}
	
	public static void  userLogin() throws Exception {
		System.out.println("enter user name: ");
		String uname= sc.next();
 		CheckDB ch1 = new CheckDB();
		String b = ch1.verifyUserName(uname);
		if (uname != null && uname.equals(b))
		{
			System.out.println("user verified!!!!");
			Login l = new Login();
			String resp = l.verifyPassword();
			System.out.println("***** welcome: "+uname+" ******* \n the available products are::");
			new AddProducts().displayProducts();
			new AddtoCart().addtocart();
		}
		else {
			System.out.println("invalid username  or email!!!! \n please register ");
			Register r=new Register();
			r.registeruser();
			
		}
	}
	
	static Scanner sc = new Scanner(System.in);
	public static<T> void main(String[] args) throws Exception {
		System.out.println("+++++ ecomm app +++++++\n1.user login\n2.Admin Login\nenter choice : ");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:userLogin();
				break;
		
		case 2:
			adminLogin();
			break;
		}
		
	}

}
