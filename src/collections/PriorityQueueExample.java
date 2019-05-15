package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<String> p = new PriorityQueue<String>();
		
		p.add("Arun");
		p.add("Bhanu");
		p.add("Charan");
		p.add("Dileep");
		p.add("Enamuel");
		p.add("Faran");
		
		System.out.println("head :"+p.element());
		System.out.println("head:"+p.peek());
		
		System.out.println("Iterating the Queue elements");
		
		Iterator<String> i = p.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		p.remove();  
		p.poll();
		
		System.out.println("after removing two elements:");  
		
		Iterator<String> itr2 = p.iterator();  
		while(itr2.hasNext())
		{  
			System.out.println(itr2.next());  
		}  
		
		

	}

}
