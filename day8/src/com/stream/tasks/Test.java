package com.stream.tasks;
import java.util.*;

public class Test {

	public static void main(String[] args) 
	{	
		Employee e[]= {new Employee("roshan",22,90000.00),
		new Employee("mani",21,5000.00),
		new Employee("prakash",27,100000.00)};
		
		List<Employee> m= Arrays.asList(e);
		
		
		System.out.println("descending order");
		System.out.println("--------");
		Arrays.stream(e).filter(b->b.salary>45000 && b.age>20)
		.sorted(Comparator.comparingDouble((Employee b)-> b.salary).reversed())
		.map(b->b.name)
		.forEach(System.out::println);
		
		System.out.println(("-----"));
		System.out.println("natural order");
		System.out.println("--------");
		Arrays.stream(e).filter(b->b.salary>45000 && b.age>20)
		.map(b->b.name)
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("--------");
		System.out.println("ascending order");
		System.out.println("--------");
		Arrays.stream(e).filter(b->b.salary>45000 && b.age>20)
		.sorted(Comparator.comparingDouble((Employee b)->b.salary))
		.map(b->b.name)
		.forEach(System.out::println);
		
		System.out.println("-----using list-------");
		System.out.println("age greater than 25");
		m.stream().filter(g->g.age>25).map(g->g.getName()).forEach(System.out::println);
		
		System.out.println("--------");
		System.out.println("after incementing 10% salary");
		System.out.println("--------");
		Arrays.stream(e).map(i->i.name + ":" + (i.salary*10+i.salary))
		.forEach(System.out::println);
		
		

	}

}
