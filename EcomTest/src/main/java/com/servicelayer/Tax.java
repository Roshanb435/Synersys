package com.servicelayer;

public class Tax {

    public double calculateTax(double price) {
        return price + (price * 0.05);
    }
}
