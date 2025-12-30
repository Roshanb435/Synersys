package day9;
import java.util.*;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		List<Integer> l= List.of(10,12,14,11,16,18,20);
		boolean anyMatch = l.stream().sorted().anyMatch(e->e==10);
		System.out.println(anyMatch);
		
		Map<Object, Object> m =l.stream().filter(e->e>5).collect(Collectors.toMap(e->e, e->e>5));
		System.out.println(m);
	
		
	}

}
