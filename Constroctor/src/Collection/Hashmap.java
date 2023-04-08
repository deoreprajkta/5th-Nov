package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {
	public static void main(String[] args) {
		
		//order of insertion Random
		HashMap<Integer,String>map = new HashMap<Integer,String>();
		
		map.put(54,"Praju");
		map.put(52,"sonawane");
		map.put(23,null);
		map.put(20,null);
		
		//Advanced for loop
		
		for(Map.Entry<Integer, String> m: map.entrySet()) {
		System.out.println("key=" +m.getKey()+"Value="+m.getValue());
		
	}
		System.out.println("***Result***");
		map.put(54,"praj");
		for(Map.Entry<Integer,String> m:map.entrySet()) {
			System.out.println("key="+m.getKey() + "Value="+m.getValue());
		}

	
		
	}

}
