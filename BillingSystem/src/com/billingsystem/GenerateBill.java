package com.billingsystem;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class GenerateBill {

    public GenerateBill(List<Billing.Dish> dishes, int orderNo) {

        System.out.println("\n**********************************************************************");
        System.out.println("Order No : " + orderNo);
        System.out.println("Date     : " + LocalDate.now());
        System.out.println("Time     : " + LocalTime.now().withNano(0));
        System.out.println("------------------------------------------------------------------------");

        System.out.printf("%-25s %-8s %-5s %-8s%n", "Dish", "Price", "Qty", "Amount");

        double total = 0;

        for (Billing.Dish d : dishes) {
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

        double sgst = total * 0.05;
        double cgst = total * 0.05;

        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("Total     : %.2f%n", total);
        System.out.printf("SGST 5%%   : %.2f%n", sgst);
        System.out.printf("CGST 5%%   : %.2f%n", cgst);
        System.out.printf("Grand Total: %.2f%n", (total + sgst + cgst));
        System.out.println("*************************************************************************");
    }
}
