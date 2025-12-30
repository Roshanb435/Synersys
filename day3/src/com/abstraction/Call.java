package com.abstraction;

abstract class whatsapp{
	abstract public void send();
}
class application extends whatsapp
{
	public void send()
	{
		System.out.println("send() method is implemented");
	}
}
public class Call {

	public static void main(String[] args) {

		whatsapp w=new application();
		w.send();
	}

}
