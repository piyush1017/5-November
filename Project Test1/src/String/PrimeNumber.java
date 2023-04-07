package String;

public class PrimeNumber {
	
//	Prime Number = A number that is divisible by 1 and itself
	
//	Example = 2, 3, 5, 7, 11, 13

//	Chek 7 is prime or not
	
//	Try to check number from 1 to 7 that is 1,2,3,4,5,6,7 which diveide the no. 7
	
//	We can divide number by 1 and 7 not others
	
//	If we get exactly two divider then we say number is prime number
//	If we get diviser that is greater than two than number is not prime
	
	public static void main(String[] args) {
		
		int num = 7;
		
		int count = 0;
		
		for(int i=1; i<=num; i++) {
			
			// 
			if(num % i==0) {
				count++;
			}
		}
//		System.out.println(count);
		
		if(count==2) { // exaclty two divider 
			System.out.println("Given Number Is Prime");
		}
		else {// More then divide by 2
			System.out.println("Given Number Is Not Prime");
		}
		
		// Trim = ?
		// Fectorial = ?
		
	}
}
