package Final;

public class Basic {
	
	//final int a = 24; //globl
	final public void Demo() {
		 int a= 50; //local veriable
		 System.out.println(a);
		 
		 
	}
	public static void main(String[]args) {
		Basic a = new Basic();
		a.Demo();
	}
	
	


}
