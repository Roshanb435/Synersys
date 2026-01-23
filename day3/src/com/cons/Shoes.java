package com.cons;

public class Shoes {
	double price;
	String color;
	boolean avail;
public Shoes(double price,String color,boolean avail)
{
	super();
	this.price=price;
	this.color=color;
	this.avail=avail;
	
}
public Shoes(double price)
{
	this.price=price;
}
	public static void main(String[] args) {
		Shoes s=new Shoes(1200.00,"red",true);
		System.out.println("price is "+ s.price+" color is "+s.color+" availablility "+s.avail);
		Shoes s1=new Shoes(600.00);
		System.out.println("After disc price is "+s1.price);
		
	}

}
