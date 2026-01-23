package day1;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Select one operation");
		System.out.println("1.Addition");
		System.out.println("2.Multiply");
		System.out.println("3.Divide");
		System.out.println("4.Subtract");
		int i=sc.nextInt();
		switch(i)
		{
			case 1: System.out.println("addition is " + a+b); break;
			case 2: System.out.println("multiplication is " + a*b);break;
			case 3: System.out.println("Division is " + a/b);break;
			case 4: System.out.println("Subtraction is " + (a-b));break;
			default : System.out.println("please enter valid input");break;
	
		}
		sc.close();
	}

}
