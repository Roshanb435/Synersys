package arrays.comparabletasks;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student("x",99,514);
		Student s2 = new Student("y",100,567);
		Student s3 = new Student("z",98,1120);
		Student st[]= {s1,s2,s3};
		Arrays.sort(st);
		for(Student x:st)
		{
			System.out.println(x);
		}
		
	}

}
