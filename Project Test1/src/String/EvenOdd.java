package String;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		// 13 odd Not able to divide by 2
		// 12 even - divide by 2
		
		int num = 12;
		
		if(num % 2 == 0) { // if number is divisible by 2 then getting the
							// reminder 0
							// reminder is 1 then number is odd
			
			System.out.println("Given Number Is Even");
		}
		else {
			
			System.out.println("Given Number Is Odd");
		}
	}

}
