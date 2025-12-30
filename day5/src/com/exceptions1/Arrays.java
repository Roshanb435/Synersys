package com.exceptions1;
import java.util.*;

public class Arrays {

	public static void main(String[] args) {
			int arr[]= {12,32,45,56,67};
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the index value");
			int i=sc.nextInt();
			try
			{
				System.out.println(arr[i]);
				System.out.println(arr[i]/0);
			}
			//using exception class
			catch(Exception e)
			{
				System.out.println("exception handled");
				System.out.println(e.getMessage());
			}
			//using different catch blocks for each exception 
			/*catch(ArithmeticException e)
			{
				System.out.println("Cant divide with 0");
				
			}
			catch(ArrayIndexOutOfBoundsException ae)
			{
				System.out.println("enter index in the range 0-4");
			}*/
			finally
			{
				System.out.println("Finally block executed");
				
			}
	}

}
