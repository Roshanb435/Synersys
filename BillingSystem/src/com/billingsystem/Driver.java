package com.billingsystem;

import java.util.Scanner;

public class Driver {

    static int orderCounter = 1;

    public static void main(String[] args) {

        Billing billing = new Billing();
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\n1. Add Dish");
                System.out.println("2. Remove Dish");
                System.out.println("3. Search Dish");
                System.out.println("4. Sort By Price");
                System.out.println("5. Calculate Total & Generate Bill");
                System.out.println("6. Exit");
                System.out.println("Enter Your Choice");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1 -> billing.addDishById();
                    case 2 -> billing.removeDish();
                    case 3 -> billing.searchDish();
                    case 4 -> billing.sortbyprice();
                    case 5 -> {
                        billing.calculateTotal();
                        System.out.println("\n1. Modify Bill");
                        System.out.println("2. Generate Bill");
                        int ch = sc.nextInt();
                        sc.nextLine();
                        if (ch == 2) {
                            billing.generateBill(orderCounter++);
                            System.out.println("\n1. New Bill\n2. Exit");
                            int next = sc.nextInt();
                            sc.nextLine();
                            if (next == 1) billing.clearBill();
                            else System.exit(0);
                        }
                    }
                    case 6 -> System.exit(0);
                }

            } catch (NoDishException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
