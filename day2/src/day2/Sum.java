package day2;

public class Sum {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		double radius = 5.0d;
		System.out.println(addTwoNumbers(a,b));
		System.out.println(AreaOfCircle(radius));
		System.out.println(AreaOfRectangle(a,b));
	}
	public static int addTwoNumbers(int x,int y)
	{
		System.out.println("sum is ");
		return x+y;
	}
	public static double AreaOfCircle(double r)
	{
		System.out.println("area of circle is");
		return 3.14*r*r;
	}
	public static int AreaOfRectangle(int c,int d)
	{
		System.out.println("area of rectangle is ");
		return c*d;
	}

}
