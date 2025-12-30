package day6;

public class Circle {
	public Circle(int radius)
	{
		this.radius=radius;
	}
	int radius;
	@Override
	public String  toString()
	{
		return "radius:"+radius;
	}

	public static void main(String[] args) {
		Circle c= new Circle(5);
		System.out.println(c.toString());
		System.out.println(c);
		
	}

}
