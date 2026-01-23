package com.lambdaexample;
interface ComputeInterface
{
	int compute(int a,int b);
}
interface display
{
	void show(String name);
}

public class test {

	public static void main(String[] args) {
		ComputeInterface add,sub;
		add=(x,y)->{return (x+y);};
		System.out.println(add.compute(10, 20));
		sub=(x,y)->{return (x-y);};
		System.out.println(sub.compute(50, 30));
		display dis;
		dis=(name)->{System.out.println(name);};
		dis.show("HI");
		
	}

}
