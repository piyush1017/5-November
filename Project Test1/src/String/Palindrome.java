package String;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String a = "RADAR";
		
		String reverse = "";
		
		for(int i=a.length()-1; i>=0; i--) {
			
			reverse = reverse + a.charAt(i);
			
		}
//		System.out.println(reverse);
		
		if(a.equals(reverse)) {
			
			System.out.println("Given String Is Palindrome");
		}
		else {
			
			System.out.println("Given String Is Not Palindrome");
		}
	}

}
