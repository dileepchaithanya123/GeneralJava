package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> l = new LinkedHashSet<String>();
		
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.add("e");
		
		Iterator<String> i = l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
