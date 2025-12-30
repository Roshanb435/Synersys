package com.map.tasks;
import java.util.*;
import java.util.stream.Stream;

public class M2 
{	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.addAll(Arrays.asList(10,15,20,25,30));
		
		/*int sum= l.stream().reduce(0,(a,b)->a + b);
		System.out.println(sum);*/
		
		int max=l.stream().max(Comparator.naturalOrder()).get();
		System.out.println("max value using comparator"+max);
		
		int last=l.stream().reduce(0, (a,b)->a>b?a:b);
		System.out.println("max value is "+last);
		int min=l.stream().reduce(Integer.MAX_VALUE, (a,b)->a<b?a:b);
		System.out.println(min);
		
		int  count=(int) l.stream().count();
		System.out.println(count);
		
		//camt covert int to Integer if we have taken an int array so we need to autobox the primitive data type 
		//streams wont work on primitive data types 
		
	}

}
