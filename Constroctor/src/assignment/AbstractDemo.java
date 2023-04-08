package assignment;

public class AbstractDemo {
	public void show()
	{
		
		System.out.println("Show method is running from abstractdemo class");
	}
	public void test()
	{
		System.out.println("method is running from abstractdemo class");
	}
	public static void main(String[]args)
	{
		AbstractDemo x = new AbstractDemo();
		x.show();
		x.test();
		x.Demo();
		
		
	
		
	}
	private void Demo() {
		
	}

}
