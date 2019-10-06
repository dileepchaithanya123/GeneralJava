package arrayList;

import java.util.ArrayList;

public class ArrayListExample1 {

	
	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Akash");
		al.add("Bharat");
		al.add("Chaithanya");
		al.add("Dileep");
		al.add("Feroz");
		al.add("Guna");
		
		System.out.println(al);
		
		al.add(4,"Dinesh");
		
		System.out.println(al);
		
	}
}
