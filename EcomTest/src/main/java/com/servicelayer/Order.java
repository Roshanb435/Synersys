package com.servicelayer;

public class Order {

    private Tax tax = new Tax();
    private Payment payment = new Payment();

    public boolean placeOrder(double price) {

        double totalAmount = tax.calculateTax(price);
        boolean paymentStatus = payment.processPayment(totalAmount);

        return paymentStatus;
    }
}
