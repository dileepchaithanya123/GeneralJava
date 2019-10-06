package arrays;

public class SumOfArray {
	
	public static void main(String[] args) {
		
		int arr[] = {23,45,23,4,57,76,32,92};
		int sum =0;
		
		/*
		 * for(int i=0; i<arr.length; i++) { sum = sum + arr[i]; }
		 */
		
		for(int i: arr)
		{
			sum += i;
		}
		
		System.out.println(sum);
		
	}

}
