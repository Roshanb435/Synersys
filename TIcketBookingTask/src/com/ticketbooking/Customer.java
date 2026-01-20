package com.ticketbooking;

import java.util.*;

class Customer {

    private String dateOfBirth;
    private String name;
    private Ticket ticket;

    public Customer(String dateOfBirth, String name, Ticket ticket) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void displayDetails() {
        System.out.println("Name               : " + name);
        System.out.println("Date of Birth      : " + dateOfBirth);
        System.out.println("Ticket No          : " + ticket.getNumber());
        System.out.println("Class              : " + ticket.getTicketClass());
        System.out.println("Coupons:");
        for (Coupon c : ticket.getCoupons()) {
            System.out.println("  Meal Code : " + c.getMealCode());
        }
        System.out.println();
    }

    public static class CustomerNameComparator implements Comparator<Customer> {
        @Override
        public int compare(Customer c1, Customer c2) {
            return c1.getName().compareTo(c2.getName());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Customer> customerList = new ArrayList<>();
        List<Ticket> ticketList = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Ticket Booking Menu ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Display Ticket Details");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Date of Birth: ");
                    String dob = sc.nextLine();

                    System.out.println("Select Class:");
                    System.out.println("1. First AC");
                    System.out.println("2. Second AC");
                    System.out.println("3. Third AC");
                    System.out.println("4. Second Sitting");

                    int cls = sc.nextInt();
                    sc.nextLine();

                    String ticketClass =
                            cls == 1 ? "First AC" :
                            cls == 2 ? "Second AC" :
                            cls == 3 ? "Third AC" : "Economy";

                    Ticket ticket = new Ticket("TK", ticketClass, dob);
                    Customer customer = new Customer(dob, name, ticket);

                    customerList.add(customer);
                    ticketList.add(ticket);

                    ticket.bookTicket();
                    break;

                case 2:
                    if (customerList.isEmpty()) {
                        System.out.println("No tickets booked yet");
                    } else {
                        Collections.sort(customerList, new CustomerNameComparator());
                        Collections.sort(ticketList);

                        System.out.println("\n--- Customers Sorted by Name ---");
                        for (Customer c : customerList) {
                            c.displayDetails();
                        }

                    
                    }
                    break;

                case 3:
                    System.out.println("Thank you");
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } while (choice != 3);

        sc.close();
    }
}
