package com.ticketbooking;

import java.util.*;

public class Ticket implements Comparable<Ticket> {

    private static int counter = 100;

    private String ticketingCode;
    private int number;
    private String ticketClass;
    private List<Coupon> coupons;

    public Ticket(String code, String ticketClass, String dob) {
        this.number = ++counter;
        this.ticketingCode = code + number;
        this.ticketClass = ticketClass;
        this.coupons = generateCoupons(ticketClass, dob);
    }

    private List<Coupon> generateCoupons(String ticketClass, String dob) {
        List<Coupon> list = new ArrayList<>();

        switch (ticketClass) {
            case "First AC":
                list.add(new Coupon(dob, ticketClass, false, "VEG"));
                list.add(new Coupon(dob, ticketClass, false, "VEG"));
                list.add(new Coupon(dob, ticketClass, false, "NON-VEG"));
                list.add(new Coupon(dob, ticketClass, false, "NON-VEG"));
                break;

            case "Second AC":
                list.add(new Coupon(dob, ticketClass, false, "VEG"));
                list.add(new Coupon(dob, ticketClass, false, "VEG"));
                list.add(new Coupon(dob, ticketClass, false, "NON-VEG"));
                break;

            case "Third AC":
                list.add(new Coupon(dob, ticketClass, false, "VEG"));
                list.add(new Coupon(dob, ticketClass, false, "NON-VEG"));
                break;

            default:
                list.add(new Coupon(dob, ticketClass, false, "VEG"));
        }
        return list;
    }

    public int getNumber() {
        return number;
    }

    public String getTicketClass() {
        return ticketClass;
    }

    public List<Coupon> getCoupons() {
        return coupons;
    }

    public void bookTicket() {
        System.out.println("Ticket Booked Successfully");
    }

    @Override
    public int compareTo(Ticket t) {
        return this.number - t.number;
    }
}
