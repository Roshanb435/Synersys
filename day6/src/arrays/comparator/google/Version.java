package arrays.comparator.google;

import java.util.Objects;

final public class Version {
	String name;
	int version;
	int year;
	public Version(String name,int version,int year)
	{
		this.name=name;
		this.version=version;
		this.year=year;
	}
	
	@Override
	public String toString()
	{
		return "name "+name+"version "+version+"year "+year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, version, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Version other = (Version) obj;
		return Objects.equals(name, other.name) && version == other.version && year == other.year;
	}
	
	
	}
	


