package assignments;

import java.util.HashMap;

public class CountWords {

	public static void main(String[] args) {
	
		String str = "This this is is done by by Dileep dileep";
		String[] split = str.split(" ");
		for(int j=0; j<split.length-1; j++)
		{
			System.out.println(split[j]);
		}
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<split.length-1; i++)
		{
			if(map.containsKey(split[i]))
			{
				int count = map.get(split[i]);
				map.put(split[i],count+1);
			}
			
			else
			{
				map.put(split[i], 1);
			}
		}
		
		System.out.println(map);

	}

}
