package general;

public class LargestNumberInArray {
	
	public static void main(String[] args) {
		
		int [] num = {10,32,83, 9};
		int max = num[0];
		
		for(int i=0; i<num.length; i++)
		{
			if(num[i]>max)
			{
				max = num[i];
			}
		}
		
		System.out.println(max);
	}

}
