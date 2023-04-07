package String;

public class ReveseEachWordOfString {
	
	public static void main(String[] args) {
		
		String a = "my name is jignesh";
		
		String[] words = a.split(" "); //[Go, To, School]
		
		String reverseString="";
		
		for(int i =0; i<words.length;i++) {
			String word = words[i]; // Go, to
			String reverseWord="";
			
			for(int j=word.length()-1;j>=0;j--) {
				
				reverseWord= reverseWord+word.charAt(j); // o, oG, Ot
			}
			reverseString = reverseString + reverseWord+ " ";
		}
		
		System.out.println(reverseString);
	}

}
