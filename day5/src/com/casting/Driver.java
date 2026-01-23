package com.casting;

public class Driver {

	public static void main(String[] args) {
			Child c=new Child();
		System.out.println(c.p);
		System.out.println(c.c);
		Parent p=c;
		System.out.println(p.p);
		Child c1 = (Child) p;
        System.out.println(c1.c); 
		
	}

}
