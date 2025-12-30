package com.cons;

public class Limit {
	public void Limit()
	{
		System.out.println("Non-static method");
	}
	public static void main(String[] args) {
		new Limit().Limit();
		//this needs to be called manually again because it is a non-static one , by default constructor will not call it
	}

}
