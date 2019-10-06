package arrays;

public class ArrayContainsSpecificValue {
	
	public static void main(String[] args) {

	int[] a = {21,32,43,53,63,73};
	int b = 32;
	
	for(int i:a) 
	{
		
		if(i==b)
		{
			System.out.println("Element is present");
			break;
		}
		else
		{
			System.out.println("Element is not present");
		}
	}

	}
}
