package Modifiers;
class AppV1
{
	public void feature1()
	{
		System.out.println("Oldest");
	}
}
public class Example extends AppV1
{
	public void feature2()
	{
		System.out.println("New feature added");
		
	}
	public void feature1()
	{
		System.out.println("updated");
		
	}
	public static void main(String[] args) {
		Example p=new Example();
		AppV1 n=new AppV1();
		p.feature1();
		n.feature1();
		p.feature2();
	}
}

