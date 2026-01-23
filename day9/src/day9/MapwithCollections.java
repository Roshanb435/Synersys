package day9;

import java.util.*;

public class MapwithCollections {
	public static void main(String[] args) {
		Map<List<String>,Set<Object>> marks=new HashMap<List<String>,Set<Object>>();
		marks.put(List.of("maths","physics","chem"), Set.of("MPC"));
		marks.put(List.of("Biology","phy","chem"), Set.of("bipc"));
		System.out.println(marks);
		 for (Map.Entry<List<String>, Set<Object>> entry : marks.entrySet())
		     System.out.println(entry.getKey());
	
	}

}
