package Scanner;

import java.util.Scanner;

public class Scanner1 {
	
	public static void main(String[] args) {
		Scanner demo = new Scanner(System.in);
		System.out.println("Enter the integer : ");
		
		int value = demo.nextInt();
		System.out.println("Youe enterred value is: " + value);
		System.out.println();
		
		System.out.println("Enter float : ");
		
		float value1 = demo.nextFloat();
		System.out.println("Youe enterred value is:" + value1);
		System.out.println();
		
		System.out.println("Enter the string : ");
		
		String value2 = demo.next();
		System.out.println("Youe enterred value is:" + value2);
	}
	

}
