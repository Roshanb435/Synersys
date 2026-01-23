package arrays.comparatortasks;

import java.util.Comparator;

public class CompareByVersionNumber implements Comparator {

	@Override
	public int compare(Object o1, Object o2) 
	{
		Version v1= (Version)o1;
		Version v2=(Version)o2;
		if(v1.Version>v2.Version)
		{
			return 1;
		}
		else if(v1.Version<v2.Version)
		{
			return -1;
			
		}
		else
		{
			return 0;
		}
	}

	

}
