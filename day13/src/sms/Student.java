package sms;

import java.util.Scanner;

public class Student {

    private int roll;
    private String name;
    private int age;
    private double marks;

    Scanner sc = new Scanner(System.in);

    public void StudentData() {

        System.out.println("Enter Roll:");
        roll = sc.nextInt();

        System.out.println("Enter Name:");
        name = sc.next();

        System.out.println("Enter Age:");
        age = sc.nextInt();

        System.out.println("Enter Marks:");
        marks = sc.nextInt();
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }
    public Student()
    {
    	super();
    }
}
