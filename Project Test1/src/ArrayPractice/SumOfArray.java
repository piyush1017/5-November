package ArrayPractice;

public class SumOfArray {
	
	public static void main(String[] args) {
		
		int a[] = {10, 40, 30, 50, 90,20};
		
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			
			sum += a[i];
			
		}
		System.out.println(sum);
	}

}
