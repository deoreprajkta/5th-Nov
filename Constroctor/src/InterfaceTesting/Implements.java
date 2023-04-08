package InterfaceTesting;

public class Implements implements StaticInterface{
	


	
	public void show() {
		System.out.println("Method show is running");
		
	}
	public static void main(String[]args) {
	Implements c = new Implements();
	c.show(); 
	StaticInterface.xyz();
	

}
}