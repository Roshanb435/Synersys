package overriding;

public class Version21 extends Version34 
{
	String old="ios:heysiri";
	public void features()
	
	{
		System.out.println(old);
		super.features();
	}
	public static void main(String[] args) {
		Version21 p= new Version21();
		p.features();
	
		

		

	}

}
