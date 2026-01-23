package com.encapsulation;

public class Bank {
	String branch;
	String IFSC;
	String address;
	public void display(String branch,String IFSC,String address)
	{
		this.branch=branch;
		this.IFSC=IFSC;
		this.address=address;
	}
	
	public static void main(String[] args) {
		Bank b= new Bank();
		b.display("KPHb","SBIN1001234","HYD");
	}
	
	

}
