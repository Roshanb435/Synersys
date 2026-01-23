package com.stream.tasks;
import java.util.*;

public class Task1 {

	public static void main(String[] args) 
	{
		int arr[]= {10,2,5,6,8,7,9};
		System.out.println("using normal for loop and if condition");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			System.out.println(arr[i]);
		}
		System.out.println("using streams");
		int sum=Arrays.stream(arr).filter(e->e%2==0).map(e->e).sum();
		System.out.println(sum);

	}

}
