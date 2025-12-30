package day9;

import java.util.ArrayList;
import java.util.List;

public class NestedList {
	public static void main(String[] args) {
		List<List> l = new ArrayList<List>();
		l.add(List.of(12,13,15,16));
		l.add(List.of(1,2,3,4,5));
		l.add(l);
		for(List<Integer> row:l)
		{
			for(Object o:row)
			{
				System.out.println(o+" ");
			}
		}
	}

}
