package com.billingsystem;

import java.sql.*;
import java.util.*;

public class Billing {

    class Dish {
        int id;
        String name;
        double price;
        int quantity;

        Dish(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = 1;
        }
    }

    List<Dish> dishes = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void showMenu() throws Exception {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT d_id, name, price FROM dish");

        System.out.println("\n=========================== MENU ===================================");
        System.out.printf("%-5s %-25s %-8s%n", "ID", "Name","%-5s %-25s %-8s", "Price");
        while (rs.next()) {
            System.out.printf(
                    "%-5d %-25s %-8.2f%n",
                    rs.getInt("d_id"),
                    rs.getString("name"),
                    rs.getDouble("price")
            );
        }
        System.out.println("======================================================================");
        con.close();
    }

    public void addDishById() throws Exception {
        showMenu();
        System.out.print("Enter Dish ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Dish d : dishes) {
            if (d.id == id) {
                d.quantity++;
                return;
            }
        }

        Connection con = DBConnection.getConnection();
        CallableStatement cs = con.prepareCall("{CALL get_dish_by_id(?)}");
        cs.setInt(1, id);

        ResultSet rs = cs.executeQuery();
        if (rs.next()) {
            dishes.add(new Dish(
                    rs.getInt("d_id"),
                    rs.getString("name"),
                    rs.getDouble("price")
            ));
        }
        con.close();
    }

    public void removeDish() throws Exception {
        if (dishes.isEmpty()) return;

        for (int i = 0; i < dishes.size(); i++) {
            Dish d = dishes.get(i);
            System.out.println((i + 1) + ". " + d.name + " (Qty: " + d.quantity + ")");
        }

        int ch = sc.nextInt();
        sc.nextLine();

        if (ch > 0 && ch <= dishes.size()) {
            Dish d = dishes.get(ch - 1);
            d.quantity--;
            if (d.quantity == 0) {
                dishes.remove(ch - 1);
            }
        }
        showMenu();
    }

    public void sortbyprice() {
        dishes.sort(Comparator.comparingDouble(d -> d.price));
        for (Dish d : dishes) {
            System.out.println(d.name + " - " + d.price + " (Qty: " + d.quantity + ")");
        }
    }

    public void searchDish() throws Exception {
        showMenu();
        System.out.print("Enter dish name or keyword: ");
        String text = sc.nextLine();

        Connection con = DBConnection.getConnection();
        CallableStatement cs = con.prepareCall("{CALL search_dish(?)}");
        cs.setString(1, text);

        ResultSet rs = cs.executeQuery();
        while (rs.next()) {
            System.out.printf(
                    "%-5d %-25s %-8.2f%n",
                    rs.getInt("d_id"),
                    rs.getString("name"),
                    rs.getDouble("price")
            );
        }
        con.close();
    }

    public double calculateTotal() throws NoDishException {
        if (dishes.isEmpty()) {
            throw new NoDishException("No dishes added to bill");
        }

        System.out.println("\nCurrent Bill");
        System.out.printf("%-25s %-8s %-5s %-8s%n", "Dish", "Price", "Qty", "Amount");

        double total = 0;
        for (Dish d : dishes) {
            double amount = d.price * d.quantity;
            System.out.printf(
                    "%-25s %-8.2f %-5d %-8.2f%n",
                    d.name,
                    d.price,
                    d.quantity,
                    amount
            );
            total += amount;
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Total : " + total);
        return total;
    }

    public void generateBill(int orderNo) throws NoDishException {
        if (dishes.isEmpty()) {
            throw new NoDishException("No dishes added to bill");
        }
        new GenerateBill(dishes, orderNo);
    }

    public void clearBill() {
        dishes.clear();
    }
}
