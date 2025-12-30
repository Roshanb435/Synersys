package day1;

public class Operators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=20;
		int d=40;
		boolean res= c++ > d && d++ < c;
		System.out.println(c);
		System.out.println(d);
		System.out.println(res);
		
	
	System.out.println(a%2==0?"a is even":"a is odd");
	System.out.println(a>b?"a is greater":"B is greater");
	System.out.println((int)'Z');
	System.out.println('Z' - a++ + --b /10 );
		

	}

}
