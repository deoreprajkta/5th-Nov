package Inheritance;

//import Inheritance.Demo;
//import Inheritance.Demo1;
//import Inheritance.Demo3;


	public class Demo implements Demo3 , Demo1{
		private char[] a;
		private char[] p;

		public void test() {
			System.out.println("test method is running");
			
		}
		public void addition() {
			int a = 20;
			int d = 35;	
			int s = a+d;
			System.out.println(s);
		}
		public void Subtraction() {
			int a = 20;
			int d = 35;
			int s = a-d;
			System.out.println(s);
			
		}
		
		public static void main(String[]args) {
			Demo X = new Demo();
			X.test();
			X.addition();
			X.Subtraction();
			
			System.out.println(X.a);
			System.out.println(X.p);
		}

	}


