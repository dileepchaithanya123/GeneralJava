package arrays;

public class AnonymousArray {
	
	public static void printArray(int arr[]) {
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		
		printArray(new int[] {120,29,2783,91872,1901,6372});
	}
}
