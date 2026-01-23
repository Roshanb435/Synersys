package com.encapsulation.task;

public class Account {
	public static final String name="Roshan";
	private int acc;
	private double bal;
	
	public Account()
	{
		super();
	}
	public Account (double bal) {
	
		this.bal=bal;
	}
	public Account(int acc)
	{
		
		this.acc=acc;
	}
	public Account(int acc,double bal)
	{
		
		this.acc=acc;
		this.bal=bal;
	}
	
	public int getAcc() {
		return acc;
	}
	public void setAcc(int acc) {
		this.acc = acc;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public static String getName() {
		return name;
	}

}
