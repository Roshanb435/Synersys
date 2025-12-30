package com.collections;
import java.util.*;
public class ListProgram {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(123);
		l.add(256);
		l.add(2);
		l.set(0, 25);
		Collections.sort(l);
		System.out.println(l);
		Collections.sort(l, Collections.reverseOrder());
		System.out.println(l);
		l.removeAll(l);
		for(int x:l)
		{
			System.out.println(x);
		}
		
		List<Object> s=new ArrayList<>();
		s.add("roshan");
		s.add(12);
		s.add(21.2f);
		s.add(true);
		System.out.println(s);
		
	
	}

}
