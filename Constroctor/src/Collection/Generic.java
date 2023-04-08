package Collection;

public class Generic <P> {
	int a;
	P b;
	
	public static void main (String[]args) {
		Generic x = new Generic(); //1method supported to multiple data type
		x.a=56;
		System.out.println(x.a);
		
		x.b="Prajkta";
		System.out.println(x.b);
		
		x.b=458;
		System.out.println(x.b);
		x.b=25.20f;
		System.out.println(x.b);
		
	}
	

}
