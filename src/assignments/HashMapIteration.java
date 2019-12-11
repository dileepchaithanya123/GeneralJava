package assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIteration {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Dileep");
		map.put(2, "Chaithanya");
		map.put(3, "Anusha");
		map.put(4, "Nagendra Kumar");
		map.put(5, "Bhagyalakshmi");
		
		System.out.println(map.size());
		
		//-------------------------While Loop ------------------------------------------//
		
		Iterator<?> itr = map.entrySet().iterator();
		while(itr.hasNext())
		{
			@SuppressWarnings("rawtypes")
			Map.Entry mapElement = (Map.Entry)itr.next();
			System.out.println("Roll Number is "+mapElement.getKey()+ " and name of the Student is "+mapElement.getValue());
		}
		System.out.println();
		
		for(Entry<Integer, String> x : map.entrySet())
		{
			System.out.println("Roll Number is "+x.getKey()+ " and name of the Student is "+x.getValue());
		}
	}
	
	//-------------------- For Loop -------------------------------------------------------//


}
