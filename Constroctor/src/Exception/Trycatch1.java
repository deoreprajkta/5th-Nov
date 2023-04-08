package Exception;

public class Trycatch1 {
	public static void main(String[]args) {
	int a = 20;
	int b = 10;
	int c= 0;
	int f= 8;
	int d[]= {12,22,23,34,43,98,58};
	
	System.out.println("before try block code started");
     
	try {
		System.out.println("try block Risky Code");
		c=a/b;
		System.out.println(d[7]);  //event create/generated
		
		
	}
	catch(ArithmeticException e) {
		b=5;
		c=a/b;
		System.out.println("alternative code of arithmetic"); //event handle
		
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("alternative code of array");
	
		System.out.println (d[4]);
		
		try {
			System.out.println("try block Risky Code");
			f=c/b;
			System.out.println(d[10]);  //event create/generated jar out of bounds for length dili tr exception yeto
		}
		catch(ArithmeticException w) {
			b=9;
			c=c/b;
			System.out.println("alternative code of arithmetic2"); //event handle
			
		}
		
		
		
	
	
	}

	 System.out.println(c);
}
}
