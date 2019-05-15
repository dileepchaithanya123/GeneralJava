package collections;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<String>();
		
		h.add("One");
		h.add("Two");
		h.add("Three");
		h.add("Four");
		
		Iterator<String> i = h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
