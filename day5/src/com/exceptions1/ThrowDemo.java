package com.exceptions1;


public class ThrowDemo {

	public static void main(String[] args) {
		int a=10,b=15;
		if(a<b)
		{
			throw new ArithmeticException();
		}
	}

}
