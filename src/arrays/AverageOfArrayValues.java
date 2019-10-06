package arrays;

public class AverageOfArrayValues {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		
		float sum =0;
			
		for(int i: a)
		{
			sum += i;
		}
		
		System.out.println("The total sum of element is "+sum);
		System.out.println("The Average of the elements is "+(sum/a.length));
	}

}
