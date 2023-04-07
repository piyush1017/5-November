package String;

public class WhiteSpace {
	
	public static void main(String[] args) { 
		
		// Duplicate Character or White spaces in Given string
		
		String ad = "AB C DEF HE I";
		
		int total = 0; // isme o/p ane wala he (count karna he isliye int lege)
		
		for(int i = 0; i<=ad.length()-1; i++) {
			
			char s = ad.charAt(i); // konse index pe konsa chaeacter rahega
									// char return karega
//			System.out.println(s);
			
			if(s==' ') { // space kitne he vo find kr raha hr
				total++;
			}
		}
		System.out.println(total);
	}

}
