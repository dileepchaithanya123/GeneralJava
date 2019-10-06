package arrays;

public class PrintElementIndexInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {11,22,33,44,55,66,77,88,99};
		System.out.println("Index position of 22 is "+findIndex(arr,22));
		
	}
	
	public static int findIndex(int[] arr, int t) 
	{
		if(arr == null)
			return -1;
		int l = arr.length;
		int i=0;
		while( i <l)
		{
			if(arr[i] == t)
				return i;
			else 
				i = i+1;
		}
		return -1;
		
	}

}
