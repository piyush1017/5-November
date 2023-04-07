package Array;

public class SwappingArray {
	
	public static void main (String[] args) {
		
		int a[] = {15, 25, 35, 45};
		
		for(int i =0; i<=a.length-1; i++) {
			System.out.println(a[i]);
		}
		
//		a[0] = a[3] last index - 0;
//		a[1] = a[2] last index 	- 1;
		
		for(int i = 0; i<(a.length/2); i++) {
			
			// for loop 2 bar execute hoga 
			// length = 4
			// length/2 = 2
			// Condition true hote hi andar ke code ka execution hoga
			
			int c;  
			c = a[i]; // 15 c=15; take value of a[0}, 1st iteration
			
			// a[i] = free ho gaya he
			
			a[i] = a[(a.length-1)-i]; // a.lenght - 1 = a[3] , i = 0
						// a[3]-0 = a[3] = 45;  a[i]=45
						// a[(a.length-1)-i] value free ho gayi
			a[(a.length-1)-i] = c; 
					// c is nothin but a[0]
			// then 2nd iteration i=1
			// c=25
			
		}
		
		System.out.println("Swaapping");
//		System.out.println(a[0]); just for checking
		// value of a[0] = 15 but due to swapping value is 45
//		System.out.println(a[3]);
		
		// index same but value change (Main moto also interchange)
		// This is universal code
		for(int i =0; i<=a.length-1; i++) { // Same logic calling
			System.out.println(a[i]);
		}
	}

}
