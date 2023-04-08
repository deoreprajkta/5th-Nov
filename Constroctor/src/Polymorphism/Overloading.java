package Polymorphism;

public class Overloading {
 public void Multiplication(int a, int b) {
	 
	 System.out.println(a*b);
	 
 }
 public void Multiplication(int s, int t, int u) {
	 System.out.println(s*t*u);
	 
 }
 public static void main(String[]args) {
	 Overloading x = new Overloading(); //non static method calling
	 x.Multiplication(25, 50); 
	 x.Multiplication(20, 54, 80);
	 
			 
 }
}
