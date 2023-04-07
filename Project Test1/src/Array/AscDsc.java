package Array;

import java.util.Arrays;

public class AscDsc {
	
	public static void main (String[] args) {
		
		int a[] = {10, 35, 20, 60, 56, 40}; // Declaration of Array
		
//		int size = a.length-1; // 5  Last index -1
//		System.out.println(size); // Size of Array
		
		System.out.println("------All Info in Array------");
		
		for(int i =0; i<=a.length-1; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("------All Info in Array Assending------");
		
		Arrays.sort(a);
		
		for(int i =0; i<=a.length-1; i++) {
			// Here first we calling a[0]
			System.out.println(a[i]);
		}
		
		System.out.println("------All Info in Array Dscending------");
		
		// Yaha pe sirf cllaing hua he Swapping nahi
		
		for(int i = a.length-1; i>=0; i--) { // without array.sort 
									// vo delcaration ke hisab che desc karega
			// here first we calling a[5]
			System.out.println(a[i]);
			
			// yaha pe a[0] = 60 nahi hua he sirf calling hua he dsce ke hisab se
			// a[0] = 60 chahiye to swapping karni padegi
		}
	}

}
