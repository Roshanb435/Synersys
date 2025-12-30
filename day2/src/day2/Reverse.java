package day2;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123;
		int reverse=0,count=0;
		while(n>0)
		{
			count=n%10;
			reverse=reverse*10+count;
			n=n/10;
			
			
		}
		System.out.println(reverse);

	}

}
