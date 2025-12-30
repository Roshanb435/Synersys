package day2;

public class Methods {

	public static void main(String[] args) {
		Methods m= new Methods();
		char re=m.m2('x');
		System.out.println(re);
		char res=m1('x');
 System.out.println(res);
 
	}
	public static char m1(char a)
	{
		System.out.println("public method with static");
		return a;
	}
	//non static method calling using object
	private char m2(char b)
	{
		System.out.println("private method without static and using object");
		return b;
	}

}
