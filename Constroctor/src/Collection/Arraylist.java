package Collection;

import java.util.ArrayList;

public class Arraylist {
	private static int i;

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(143);
		list.add("Prajkta");
		list.add("prajuniket");
		list.add("#");
		list.add("&");
		list.add(15.60f);
		list.add(45);
		
		int size = list.size();
       // System.out.println(list.size());
        
		for(int i=0;i<=list.size()-1;i++) // or i=0;i<list.size();i++
		{
			
			System.out.println(list.get(i));
			
			
		}
		list.remove(3);
		
		System.out.println("**********After deletion of object***********");
		for(int i = 0;i<=list.size()-1;i++) {
			System.out.println(list.get(i));
		}
		
    
	}

}
