package com.exceptions1;


public class DelayClass {

	public static void main(String[] args)  {
		for(int i=1;i<=5;i++)
		{
			System.out.println("hello");
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			
		}

	}

}
