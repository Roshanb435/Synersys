package arrays.comparator.google;

import java.util.Arrays;

public class Driver {
	Version []v= {new Version("Pixel7",7,2022),new Version("Pixel10",10,2025)};
	
	public static void main(String[] args) 
	{
		Driver d= new Driver();
		d.sortByVersionno();
		System.out.println("---------------------------------------------------");
		d.sortByYear();
	}
	public void sortByVersionno()
	{
		Arrays.sort(v,new CompareByVersionno());
		for(Version v1:v)
		{
			System.out.println(v1);
		}
	}
	public void sortByYear()
	{
		Arrays.sort(v,new CompareByYear());
		for(Version v1:v)
		{
			System.out.println(v1);
		}
	}

}
