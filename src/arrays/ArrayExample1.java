package arrays;

public class ArrayExample1 {
	
	public static void main(String[] args) {
		
		double[] al = {10.23, 20.34, 30.45, 50.98};
		double total = 0;
		
		for(int i=0; i<al.length;i++) {
			System.out.println(al[i]);
			total += al[i];
		}
		
		System.out.println(total);
		
		
	}

}
