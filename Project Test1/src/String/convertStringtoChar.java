package String;

import java.util.Arrays;

public class convertStringtoChar {
	
	public static void main(String[] args) {
		
		System.out.println("------Convert string into sequence of chararcter");
		
		String a = "Jignesh";
		
		a = a.toLowerCase();
		
		char[] b = a.toCharArray();
		
//		Arrays.sort(b);
		
//		System.out.println(b);
		
		for(int i=0; i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("------Convert string into aplphabetical order");
		
		String b1 = "Jignesh";
		
		b1 = b1.toLowerCase();
		
		char[] c = a.toCharArray();
		
		Arrays.sort(c);
		
		System.out.println(c);
		
		
		
//		String a = "Jignesh";
//		
////		a=a.toLowerCase();
//		
//		char[] s = a.toCharArray();
//		Arrays.sort(s);
//		
//		char temp;
//		
//		for(int i =0; i<=a.length(); i++) {
//			for(int j=i+1;j<a.length();j++) {
//				if(s[i]>s[j]) {
//					temp=s[i];
//					s[i]=s[j];
//					s[j]=temp;
//				}
//			}
//		}
//		System.out.println(s);
	}

}
