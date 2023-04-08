package assignment;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int num = 6;
		int fact = 1;
		for(int i= 1; i<=6;i++) {
			
			fact = fact*i;
			
		}
		System.out.println("factorial of" +num + "is " +fact );
		

	}

}
