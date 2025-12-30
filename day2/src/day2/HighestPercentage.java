package day2;
import java.util.Scanner;
public class HighestPercentage {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first student name and Second student name");
		String s=sc.nextLine();
		String s1=sc.nextLine();
		System.out.println("enter percentage of first student and second student");
		int a=sc.nextInt();
		int a1=sc.nextInt();
		calculate(s,s1,a,a1);
		sc.close();
	}
	public static void calculate(String x,String y,int c, int d)
	{
		if(c>d)
		{
		
			System.out.println("highest percentage is" + x +" with "+ c);
		}
		else
		{
			System.out.println("highest percentage is " + y +" with "+ d);
			
		}
		
	}

}
