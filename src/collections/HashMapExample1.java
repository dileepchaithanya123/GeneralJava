package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample1 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "Dileep");
		hm.put(102, "Chaithanya");
		hm.put(103, "Kumar");
		hm.put(104, "Dileep");
		
		
		System.out.println("After invoking put() method ");  
	      for(Entry<Integer, String> m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }  
		
	}

}
