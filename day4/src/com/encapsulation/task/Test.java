package com.encapsulation.task;

public class Test {

	public static void main(String[] args) {
			Account a=new Account();
			System.out.println(a.name==a.getName());
			a.setAcc(402224111);
			System.out.println(a.getAcc());
			a.setBal(1000.00);
			System.out.println(a.getBal());
			System.out.println(a.getName());
	}

}
