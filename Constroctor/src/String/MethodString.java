package String;

public class MethodString {

	public static void main(String[] args) {
		
		
		String a1 = "Prajkta";
		String a2 = "Aniket";
		String a3 = "prajktaljkhjjhfjjnnoohmdyflsalsfhfejdks";
		String a4 = "ta  nu";
		String a5 = " ";
		String a6 = "Praljkta";
		 
		System.out.println(a1.charAt(4));
		
		System.out.println(a2.replace("Aniket", "Shradha"));
		
		System.out.println(a5.isEmpty());
		
		System.out.println(a4.concat(a1));
		
		System.out.println(a2.substring(2,4));
		
		System.out.println(a3.startsWith("ta"));
		
		System.out.println(a2.endsWith("t"));
		
		System.out.println(a3.indexOf("a"));
		
		System.out.println(a3.lastIndexOf("a"));
		
		System.out.println(a4.length());
		
		
		System.out.println(a6.contains("al"));
		
		
		
		
		
		System.out.println(a1==a6);
		System.out.println(a1.equals(a2));
		
		
		String a = " MADAM ";
		String reverse = "";
		for(int i = a.length()-1;i>=0;i--) {
			reverse = reverse + a.charAt(i);
			
			
		}
		System.out.println(reverse);
		
		
		
		String  s = " Prajkta ";
		System.out.println(s.trim());  //space cut
		
		
		

		

		

	}//String a = "MADAM";
     //String reverse = ""; 
	//for(int i = a.length()-1;i>=0;i--) {
	//	reverse = reverse + a.charAt(i);
		
		
	
	//System.out.println();
	
	
	
}


