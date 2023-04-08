package Exception;

public class Trycatchfinally23mar {
	

	public static void main(String[]args) {
		int a = 20;
		int b = 25;
		int c = 46;
		int d = 38;
		int e[] = {20,45,64,85,74};
		System.out.println("before try block code started");
		
		try {
			System.out.println("try block Risky  code");
			c=a/b;
			System.out.println(e[3]); //event exception generated
		}
		catch(ArithmeticException Arithmetic) {
			b=21;
			c=a/b;
			System.out.println(Arithmetic);
			System.out.println("alternative code of arithmetic");
			
		}
		finally {
			System.out.println("finally block executed");
			
			//normal flow
		}
	}

}