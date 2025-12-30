package collections.maptasks;
import java.util.*;
public class GenericsDemo {

	public static void main(String[] args) 
	{
		Map<Integer, Object> m=new HashMap<>();
		m.put(1,"Pathanjali");
		m.put(2, "britania");
		m.put(3, "ITC");
		System.out.println(m);
		m.putAll(m);//tried to duplicate all the key value pairs
		m.put(1, "Dukes");
		System.out.println(m.entrySet());
		System.out.println(m.keySet());
		System.out.println(m);//can't be duplicated but old value is discarded
		System.out.println(m.replace(1, "Cadbury"));
		System.out.println(m.entrySet());
		m.putIfAbsent(4, "Amul");
		System.out.println(m.entrySet());
		System.out.println(m.getOrDefault(1, 0));
		System.out.println(m.containsKey(1));
		System.out.println(m.containsValue("ITC"));
		System.out.println(m.size());

		
	}

}
