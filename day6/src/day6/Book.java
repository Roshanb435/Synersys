package day6;

import java.util.Objects;

public class Book {
	String name;
	public Book(String name)
	{
		this.name=name;
	}
	@Override
	public String toString()
	{
		return "Bookname: "+name;
	}
	//overriding equals method to get true for the content rather than the
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		if(getClass()!=obj.getClass()) return false;
		Book other=(Book) obj;
		return Objects.equals(name, other.name);
	}

	public static void main(String[] args) {
		Book b1=new Book("Java");
		Book b2=b1;
		Book b3=new Book("Java");
		System.out.println("b1.hashCode() ="+b1.hashCode());
		System.out.println("b2.hashCode() ="+b2.hashCode());
		System.out.println("b3.hashCode() ="+b3.hashCode());
		System.out.println(b1);
		System.out.println("b1.equals(b2) ="+b1.equals(b2));
		System.out.println("b1==b2 ="+ (b1==b2));
		System.out.println("b1.equals(b3) ="+b1.equals(b3));
		System.out.println("b1==b3 =" +(b1==b3));
		System.out.println("b1.hashCode()==b2.hashCode() ="+(b1.hashCode()==b2.hashCode()));
		System.out.println("b1.hashCode()==b3.hashCode() ="+(b1.hashCode()==b3.hashCode()));
		
	}
	

}
