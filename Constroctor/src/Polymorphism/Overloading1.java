package Polymorphism;

public class Overloading1 {
	
	public static void Subtraction(int x, int y) {
		System.out.println(x-y);
		
		
	}
	public static void Subtraction(int a, int b, int c) {
		System.out.println(a-b-c);
	}
	public static void main(String[]args) { //static method calling
		Overloading1.Subtraction(20,15);
		Overloading1.Subtraction(50,20,30);
	}

}
