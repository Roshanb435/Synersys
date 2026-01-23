package arrays.comparatortasks;

import java.util.Comparator;

public class CompareByName implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Version v1=(Version)o1;
		Version v2=(Version)o2;
		return v1.name.compareTo(v2.name);
	}

	

}
