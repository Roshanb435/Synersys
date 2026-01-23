package com.exceptions1;
import java.util.*;

public class CustomExceptionCall 
{

	public static void main(String[] args) throws NotEligible
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		try 
			{
				if(age<18|| age>=45)
						{
							throw new NotEligible("not eligible to vote");
						}
				else
						{
							System.out.println("eligible to vote");
						}
			}
		finally {
			System.out.println("executed");
		}
		
		/*catch(NotEligible e)
		{
			System.out.println(e);
		}*/
		
		
	}

}
