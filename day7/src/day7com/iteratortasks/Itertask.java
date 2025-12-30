package day7com.iteratortasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Itertask {

	public static void main(String[] args) {
		List<Object> l=new ArrayList<>();
		l.add("roshan");
		l.add(1);
		l.add(5.3f);
		l.add(true);
		Iterator<Object> it = l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		for(Object i:l)
		{
			System.out.println(i);
		}
		l.removeAll(l);
		System.out.println(l);
		
	}

}
