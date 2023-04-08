package Collection;

public class GenericmultipleDT <A,B>{
	//int a;
	A b;
	
	
	A Demo (B x) {  //B accept argument
		// demo return type G 
		System.out.println(x);
		return b;
		
		
	}
	public static void main(String[]args) {
		GenericmultipleDT<Integer,String> y= new GenericmultipleDT <Integer,String>();
		y.b = 857;
		int z = y.Demo("Prajkta");
		System.out.println(z);
	}
	
	
	

}
