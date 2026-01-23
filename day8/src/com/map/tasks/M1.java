package com.map.tasks;

import java.util.List;

public class M1 {

	public static void main(String[] args) 
	{
		List<Integer> l=List.of(1,2,3,4,5);
		List<String> f = List.of("12","13.0000","14");
		l.stream().map(e->e*e).filter(e->e>15).sorted().forEach(System.out::println);
		double sum=f.stream().mapToDouble(Double::parseDouble).sorted().sum();
		//forEach(System.out::println);
		System.out.println(sum);
		

	}

}
