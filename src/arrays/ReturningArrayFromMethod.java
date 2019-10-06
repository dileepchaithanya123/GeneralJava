package arrays;

public class ReturningArrayFromMethod {
	
	static int[] get()
	{
		return new int[] {10,30,89,90,55};
	}
	
	public static void main(String[] args) {
		
		int arr[] = get();
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
