package Logicalprogram;

public class star {

	public static void main(String[] args) {
		
		int star = 3;
		int space = 1;
		
		for(int i=1; i<=7;i++) {
			
			for(int j=0;j<=2;j++) {
		
			System.out.print(" ");
			 
		
		}
		for(int k = 1;k<=star;k++)
			System.out.print("*");
		System.out.println();
		
		if(i<=5);{
			space--;
			star=star++;
			
		} 
		{
			space++;
			star=star--;
		}
			
	}

	}
}
