package Polymorphism;

public class Ridding1 extends Ridding{
	
	public void Execution() {
		
		System.out.println("Method from sub class");
		
	}
	public static void main(String[]args) {
		Ridding1 X = new Ridding1();
		X.Execution();
		
		Ridding y = new Ridding();
		y.Execution();
	}
	

}
