package arrays.comparabletasks;

import java.util.Objects;
import java.util.*;

public class Student implements Comparable{
	String name;
	int marks;
	int rollno;
	
	public Student(String name,int marks,int rollno)
	{
		super();
		this.name=name;
		this.marks=marks;
		this.rollno=rollno;
	}

	@Override
	public String toString() {
		return "rollno "+ rollno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marks, name, rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks && Objects.equals(name, other.name) && rollno == other.rollno;
	}
	
	@Override
	public int compareTo(Object o)
	{
		Student s1=(Student)o;
		if(this.rollno>s1.rollno)
		{
			return 1;
		}
		else if(this.rollno<s1.rollno)
		{
			return -1;
			
		}else
		{
			return 0;
		}
	}
	
}
