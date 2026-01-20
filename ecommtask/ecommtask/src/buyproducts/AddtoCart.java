package buyproducts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import products.AddProducts;
import products.Product;

public class AddtoCart {

    public void addtocart() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecom?","root","Root");
        Scanner sc = new Scanner(System.in);
        while(true)
        {
        System.out.println("choose no of products to add to cart: ");
        int n = sc.nextInt();

        List<Product> cart = new ArrayList<>();
        AddProducts ap = new AddProducts();

        for (int i = 1; i <= n; i++) {

            System.out.println("enter the product id");
            int pid = sc.nextInt();
    	    PreparedStatement st = con.prepareStatement("SELECT * FROM product WHERE pid=?");
    	    st.setInt(1, pid);
    	    ResultSet rs = st.executeQuery();
    	    Product p = null;
    	    if (rs.next()) {
    	        p = new Product( rs.getString("cat"), rs.getInt("pid"), rs.getString("pname"),rs.getDouble("price")
    	        );
    	    }
            if (p != null) {
                cart.add(p);
                System.out.println("product added to cart successfully");
            } else {
                System.out.println("product not found");
            }
 }
        System.out.println("1.View Cart\n2.Proceed to payment");
        int ch = sc.nextInt();

        switch (ch) {

        case 1:
            for (Product d : cart) 
            {
            	System.out.println(d.getPid() + " | " +d.getPname() + " | " +d.getPrice() + " | " +d.getCat());
            }
            System.out.println("\n1. Add more products\n2. Proceed to payment");
            int next = sc.nextInt();

            if (next == 1) {
                continue;
                } else if (next == 2) {
                Payment.paymentmethod();
                return;
            } else {
                System.out.println("choose right option!!");
            }
            break;
            
        case 2:Payment.paymentmethod();
            break;
            
        default:System.out.println("choose right option!!"); break;
        }
       
    }
  }
	
}
