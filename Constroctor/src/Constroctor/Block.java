package Constroctor;

public class Block { 
	// non static Block
	{
		System.out.println("Non-Static block is running");
	}
	public static void main(String[]args) {
		System.out.println("Main method running");
		
		Block X = new Block();
		
		
	}
	//static Block
	static {
		System.out.println("Static block is running");
	}

}
