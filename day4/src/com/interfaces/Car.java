package com.interfaces;

public class Car implements Vehicle{
		

	@Override
	public void m1() {
		System.out.println("m1");
	}

	@Override
	public void m3() {
		System.out.println("m3");
	}
	public static void main(String[] args) {
        Car v = new Car();
        v.m1();
        Vehicle.m2(); // static method called using interface name
        v.m3();
        
    }
	

}
