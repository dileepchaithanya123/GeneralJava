package arrays;

public class RemoveSpecificElementInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int remove = 10;
		
		int flag =0;
		int loc = 0;
		
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == remove)
			{
				flag = 1;
				loc = i;
				break;
			}
			else
			{
				flag =0;
			}
		}
		if(flag ==1)
		{
			for(int i= loc+1; i< arr.length; i++)
			{
				arr[i-1] = arr[i];
			}
			System.out.println("After Deleting ");
			for(int i=0; i<arr.length-2; i++)
			{
				System.out.println(arr[i]);
			}
			
			System.out.println(arr[arr.length-2]);
		}
		else
			System.out.println("Element not found");
		
	}
	

}
