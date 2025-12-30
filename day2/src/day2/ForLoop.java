package day2;
import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		while(m<=n)
		{
			if(m%3==0 && m%5==0)
			{
				System.out.println(m);
			}
			m++;
		}
		sc.close();

	}

}
