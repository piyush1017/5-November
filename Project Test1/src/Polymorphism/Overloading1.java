package Polymorphism;

public class Overloading1 { // Overloading for static
	
public static void addition(int a, int b) {
		
		System.out.println(a+b);
	}
	
	public static void addition(int a, int b, int c) {
		
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		
		Overloading1.addition(10, 20);
		Overloading1.addition(20, 50, 20);
		
	}
	

}
