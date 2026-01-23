package arrays.comparatortasks;

import java.util.Objects;

final public class Version 
{
	String name;
	public int Version;
	int yop;
	public int year;
	public Version(String name,int Version,int yop)
	{
		super();
		this.name=name;
		this.Version=Version;
		this.yop=yop;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Version, name, yop);
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
		return Version == other.Version && Objects.equals(name, other.name) && yop == other.yop;
	}
	@Override
	public String toString() {
		return "Version [name=" + name + ", Version=" + Version + ", yop=" + yop + "]";
	}
	

}
