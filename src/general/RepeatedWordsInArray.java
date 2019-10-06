package general;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedWordsInArray {
	
	public static void main(String[] args) {
		
		String [] arr = {"a", "r" ,"b", "k", "c", "d", "se", "f", "g", "a", "d", "f", "s", "s", "d", "s", "ft", "gh", "f", "ws","w", "f", "v", "x", "s", "g", "h", "d", "h", "j", "j", "k", "f", "sd", "j", "e", "wed", "a", "d", "f"};
		
		System.out.println(arr.length);
		
		for(String s : arr)
		{
			System.out.println(s);
		}
		
		List<String> list = Arrays.asList(arr);
		
		Set<String> unique = new HashSet<String>(list);
		
		for(String str : unique)
		{
			System.out.println(str+ ":" +Collections.frequency(list, str));
		}
		
	}

}
