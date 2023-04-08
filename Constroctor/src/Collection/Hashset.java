package Collection;

import java.util.HashSet;

public class Hashset {
	public static void main(String[]args) {
		HashSet set = new HashSet();
		
		set.add("praj");
		set.add('@');
		set.add(125);
		set.add(null);
		
		System.out.println(set);
		for(Object f : set) {
			System.out.println(f);
		}
		
	}

	
		
	}


