package com.cons;

class Author {
	String authorName;
	int age=25;
	String place="hyd";

}

class Book extends Author
{
	String name;
	int price;
	Book(String name,int price,String authorName)
	{
		this.name=name;
		this.price=price;
		this.authorName=authorName;
	}
	public static void main(String args[])
	{
		Book b=new Book("Upgrade",50,"Roshan");
		System.out.println("name is "+b.name+"price is "+b.price+"author is "+b.authorName+"age is "+b.age+"place is "+b.place);
	}}


