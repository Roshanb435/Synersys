package arrays.comparatortasks;

import java.util.Arrays;

public class Driver {
	Version []v= {new Version("IOS.1.90",19,2021),new Version("IOS.21.90",21,2025)};
	
	public static void main(String[] args) 
	{
		Driver d= new Driver();
		d.sortByName();
		System.out.println("---------------------------------------------------");
		d.sortByVersion();
	}
	public void sortByVersion()
	{
		Arrays.sort(v,new CompareByVersionNumber());
		for(Version v1:v)
		{
			System.out.println(v1);
		}
	}
	public void sortByName()
	{
		Arrays.sort(v,new CompareByName());
		for(Version v1:v)
		{
			System.out.println(v1);
		}
	}

}
