package buyproducts;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Payment {
	public static void paymentmethod() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ecom?","root","Root");
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("choose on the payment methods\n1.Cash On Delivery\n2.Card\n3.UPI");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Ordered Succesfully!!");break;
		case 2: {
			System.out.println("1.add new card\n2.Choose existing card by name");
			int x=sc.nextInt();
			switch(x)
			{
			case 1:{

				System.out.println("enter the card details");
				PreparedStatement ps = con.prepareStatement("insert into cards(name,cardno,expiryyear,cvv) values (?,?,?,?)");
				System.out.println("enter cardholder name");
				ps.setString(1, sc.next());
				System.out.println("enter the card no");
				ps.setLong(2, sc.nextLong());
				System.out.println("enter the expiry year");
				ps.setInt(3,sc.nextInt());
				System.out.println("enter the cvv");
				ps.setInt(4, sc.nextInt());
				System.out.println("card added succesfully");
				ps.executeUpdate();
				
				break;
				}
				
			case 2: {

			    System.out.println("enter the cardholder name to use:");
			    String cname = sc.next();

			    PreparedStatement ps = con.prepareStatement(
			            "call getCardByName(?)"
			    );
			    ps.setString(1, cname);

			    ResultSet rs = ps.executeQuery();

			    if (rs.next()) {

			        System.out.println("Card Found:");
			        System.out.println(
			                rs.getString("name") + " | " +
			                rs.getInt("cardno") + " | " +
			                rs.getInt("expiryyear")
			        );

			        System.out.println("Payment Successful!");
			    }
			    else {
			        System.out.println("No card found with that name.");
			    }

			    break;
			}

			default:System.out.println("choose right option!!"); break;

				
			}
		break;}
		case 3:
			System.out.println("enter UPI ID");
			String UPI=sc.next();
			System.out.println("Ordered Succesfully");break;
		default:System.out.println("choose right option!!"); break;
	
	}
return ;}
}}