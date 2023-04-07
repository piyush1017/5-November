package ArrayPractice;

import java.util.Arrays;

public class HighestArrayNo { //Find Nth Highest Number in array
	
	
	public static void main(String[] args) {
		
		int a [] = {1,7,3,2,5}; 
		
		
		Arrays.sort(a);
		int size = a[a.length-2];
		
		System.out.println(size);
		
		
	}

}
