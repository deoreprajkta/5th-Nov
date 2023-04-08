package String;

public class Amstrongnu {

	public static void main(String[] args) {
		
		
		int orig = 153;
		int add = 0;
		
		
		for (int i = orig; i >0;i=i/10) {
			
			int reminder = i%10;
			add=add + (reminder*reminder*reminder);
			
			
		}
		//System.out.println(add);
		
	
		
	if (orig == add) {
	System.out.println("amstrong num");
	
}
else {
	System.out.println("not amstrong num");
		

	}
}
}
