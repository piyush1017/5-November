package Casting;

public class Explicit {
	
	public static void main(String[] args) { // high to lower dataType convert 
		
		// Data type loss ho raha he.
		
		double a= 130; // memory size is 8 byte
		// agar 50 dege to data loss nahi hoga
		System.out.println(a);
		
		int b= (int)a; // memory size is 4 byte
		System.out.println(b);
		
		byte c= (byte)b; // memory size is 1 byte
		System.out.println(c);
		
		// byte = (-128 to -127)
		// -128  -127  -126
		// loss by 3
		// 130 - 127 = 3
		
		// boolean ka program nahi lete
	}

}
