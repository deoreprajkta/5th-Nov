package Casting;

public class TestUpcasting {
	
	public static void main(String[]args) {
		System.out.println("*****Super class method*****");
		
		
		Upcasting x = new Upcasting();
		x.Demo();
		x.Run();
		x.Staticcasting();
		
		System.out.println("*****sub class method*****");
		
		Upcasting1 y = new Upcasting1();
		y.Demo();
		y.Run();
		y.subclass();
		y.Staticcasting();
		
		System.out.println("*****Casting Method*****");
		
		Upcasting z = new Upcasting1();
		z.Demo();
		z.Run();
		z.Staticcasting();
		
		
		Upcasting1 a = (Upcasting1) new Upcasting();
		a.Demo();
		a.Run();
		a.subclass();
		a.Staticcasting();
		
		
	}

	
}
