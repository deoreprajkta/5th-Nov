package Array;


import java.util.Arrays;

public class AsceDesce {

	public static void main(String[] args) {
		
		
		int a [] = {63,20,35,95,50,60};
		
		System.out.println("*****All info in Array*****");
		
		for (int i = 0; i<=a.length-1; i++) {
			System.out.println(a[i]);
			
		}
		Arrays.sort(a);
		System.out.println("****All info in Array Ascending****");
		for(int i = 0;i<=a.length-1;i++) {
			System.out.println(a[i]);
			
		}
		System.out.println("****All info in Array Descending****");
		for (int i =a.length-1;i>=0;i--) {
			System.out.println(a[i]);
			
		}
		
		
		

	}

}
