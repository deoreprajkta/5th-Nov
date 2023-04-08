package InterfaceTesting;

public interface Default {
	
	public default void Mart() {
		System.out.println("Shops");
		
	}
	public static void xyz() {
		System.out.println("Static method of interface is running");
		
	}
	public void show();

}
