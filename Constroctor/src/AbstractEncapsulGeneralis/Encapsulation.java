package AbstractEncapsulGeneralis;

public class Encapsulation {
	private int c = 65;
	private int d = 95;
	
	Encapsulation() {
		c = 20;
		d = 35;
	}
	Encapsulation(int e, int f) {
		c = e;
		d = f;
	}

	public void Demo() {
		int g = c+d;
		System.out.println(g);
		
	}
	public static void main(String[]args) {
		Encapsulation x = new Encapsulation();
		x.Demo();
		
	}

}
