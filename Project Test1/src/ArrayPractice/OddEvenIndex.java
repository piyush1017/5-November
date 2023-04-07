package ArrayPractice;

public class OddEvenIndex {
	
	public static void main(String[] args) {
		
		int a [] = {60, 50, 90, 70, 55};
		
		System.out.println("Even index");
		
		for(int i=0; i<a.length; i=i+2) { // Even  index
			
			System.out.println(a[i]);
		}
		
		System.out.println("Odd index");
		for(int i=1; i<a.length; i=i+2) { // Odd index
			
			System.out.println(a[i]);
		}
	}

}
