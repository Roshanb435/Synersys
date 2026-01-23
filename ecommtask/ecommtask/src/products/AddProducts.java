package products;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import buyproducts.AddtoCart;

public class AddProducts {
	
	public void addToDB() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/ecom?",
				"root",
				"Root");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Category:");
		String cat = sc.nextLine();

		System.out.println("Enter Product Id:");
		int id = sc.nextInt();
		sc.nextLine(); 

		System.out.println("Enter Product Name:");
		String name = sc.nextLine();

		System.out.println("Enter Price:");
		double price = sc.nextDouble();
		Product p1 = new Product(cat, id, name, price);
		
		List<Product> list = new ArrayList<>();
		list.add(p1);
		String q = "INSERT INTO product(pid, pname, price, cat) VALUES (?, ?, ?, ?)";

		PreparedStatement st = con.prepareStatement(q);

		for (Product p : list) {
		    st.setInt(1, p.getPid());
		    st.setString(2, p.getPname());
		    st.setDouble(3, p.getPrice());
		    st.setString(4, p.getCat());
		    st.executeUpdate();
		}

		System.out.println("Product inserted successfully!");
		new AddtoCart().addtocart();
		
	}

	public void displayProducts() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/ecom?",
				"root",
				"Root");
		String q = "select* from product;";
		PreparedStatement st = con.prepareStatement(q);
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			System.out.println("|"+rs.getObject(1)+"|"+rs.getObject(2)+"|"+rs.getObject(3)+"|"+rs.getObject(4));
		}

		
	}

}
