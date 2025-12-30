package arrays.comparator.google;

import java.util.Comparator;

public class CompareByVersionno implements Comparator {
	
	public int compare(Object o1,Object o2)
	{
		Version v1=(Version)o1;
		Version v2=(Version)o2;
		if(v1.version>v2.version)
		{
			return 1;
		}
		else if(v1.version<v2.version)
		{
			return -1;
			
		}
		else
		{
			return 0;
		}
	}

	
	

}
