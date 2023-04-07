package String;

public class MethodString { // String is Case Sensitive
	
	public static void main(String[] args) {
		
		String s1 = "Velocityc";
		String s2 = "PQR"; // velocity
		String s3 = "CITY"; // VELOCITY
		String s4 = "xyz";
		String s5 = "ABC";
		
		// string ke class me se ye method la rahe he
		// input index ke form me le raha he
//		System.out.println(s1.charAt(2)); //to print character at any index
//		
//		System.out.println(s2.replace("v", "y"));// to replace old character to new
//		// swapping nahi bol sakte (yaha pe overloading hua he becoz method name
//		//same he arguments diff he)
//		// jitne bhi v he vo sab replace ho jayege string ke andar
//		// String case sensitive he
//		System.out.println(s2.isEmpty()); // false
//		// agar kuch nahi raha to true dega
//		System.out.println(s2.concat(s3));// to combine 2 strings
//		System.out.println(s2.substring(2)); // 2 and uske age kin index lega
//		System.out.println(s2.substring(4, 6)); // begining and end with
//		// 4 se 5 tak liya 6 nahi liya , 6 ke age ki nikal dega
//		System.out.println(s1.startsWith("ve"));
////		System.out.println(s1.endsWith("ty"));
//		System.out.println(s1.indexOf("c")); // Start vale c ka index degi
//		System.out.println(s1.lastIndexOf("c")); // sabse last wale c ka index 
//		System.out.println(s1.length());
//		System.out.println(s1.contains("s3"));
//		System.out.println(s1==s3);
//		System.out.println(s2.equals(s3));
		
		System.out.println(s2.equalsIgnoreCase(s3)); // True
		//Comaprison karegi, alphabet ko ignore karegi , caseSensitive ko bhi
		// ignore karega and output true dega
		
		System.out.println(s1.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		String c = String.join(s2,s1,s3,s4,s5);
		// s2 join kar raha he s1 and s3 ko (s2,s1,s3)
		// jo start me likhege vo help karta he join karne ke liye
		
		// har bar s2 bich me ayega join karne ke liye
		// mostly we used concat 
		// diff is multiple string join
		System.out.println(c);
		
		String s6 = "JigneshcJagdishcKhairnar";
		
		String[] result = s6.split("c"); // detail in book
		for(int i=0; i<result.length; i++) { // array ko console me late he vese
					// yaha pe liya he multiple he isliye
			
			// c se seprate kiya he to c nikal jayega and 
			// uske age ka next line pe print karke dega
			
			System.out.println(result[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
