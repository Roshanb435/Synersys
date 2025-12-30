package Modifiers;

class parent{
	void test()
	{
		System.out.println("parent class");
	}
}

public class child extends parent {
	void test()
	{
		System.out.println("child class");
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		parent p=new child();
		p.test();
		child c=new child();
		c.test();
		parent s=new parent();
		s.test();

	}

}
