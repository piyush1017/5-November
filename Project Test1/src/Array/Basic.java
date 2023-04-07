package Array;

public class Basic {
	
	public static void main(String[] args) {
		
//		EX = 1
		
//		int a [] = {10,20,30,40,50}; initialization and declaration at same time
		
		// size edit kar sakte he means new program run 
		
//		Ex = 2
		
		String ar[] = new String[5]; // 1st declare
		ar[0] = "Ganesh";
		ar[1] = "Mahesh"; // after initialize
		ar[2] = "Ramesj";
		ar[3] = "Suresh";
		ar[4] = "Jayesh";
//		ar[5] = "Jignesh"; // Size is 5 thats why show error
		
//		System.out.println(ar[4]); // For single calling 
		
		for(int i=0; i<=4; i++) { // For overall calling
			System.out.println(ar[i]);
		}
		
	}

}
