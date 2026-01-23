package day2;

public class demo1 {

	int a;
	int b=10;
	public static void main(String[] args) {
		System.out.println("Hello");
		demo1 obj=new demo1();
		obj.hey();

	}
//non static are executed only with the object creation until it will not be executed 
	void hey()
	{
		System.out.println("Hi");
	}
	
	static int c;
	static int d=10;
	//static is executed first irrespective of main method 
	static
	{
		System.out.println("heyy");
	}
	
	//in this code ,first static is executed and then main method and then non-static is executed 
	//as object is created 
		

}
