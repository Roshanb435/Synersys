package arrays.comparator.google;

import java.util.Comparator;

import arrays.comparatortasks.Version;

public class CompareByYear implements Comparator {
	public int compare(Object o1, Object o2) 
	{
		Version v1= (Version)o1;
		Version v2=(Version)o2;
		if(v1.year>v2.year)
		{
			return 1;
		}
		else if(v1.year<v2.year)
		{
			return -1;
			
		}
		else
		{
			return 0;
		}
	}

}
