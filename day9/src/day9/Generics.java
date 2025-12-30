package day9;

import java.util.ArrayList;
import java.util.List;

public class Generics<T> {
	List<T> l = new ArrayList<T>();
	
	public Generics(List<T> l)
	{
		this.l=l;
	}
	public void display()
	{
		System.out.println(this.l);
	}
	public static void main(String[] args) 
	{
		Generics<Object> u = new Generics<Object>(List.of(123,456,"Roshan"));
		Generics<String> s = new Generics<String>(List.of("helloo","Roshan"));
		u.display();
		s.display();
			
	}
	// so here we use generics because we have using single list so using a single generics
	//we can have multiple type of lists , this is the purpose of the generics here 

}
