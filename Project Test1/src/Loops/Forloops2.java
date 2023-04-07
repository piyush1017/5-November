package Loops;

public class Forloops2 {

	public static void main(String[] args) {
		//Even Numbers
		System.out.println("Even Numbers");
		for (int i =10; i>=0; i=i-2) {
			System.out.println(i);
		}
		
		//Odd Numbers
		System.out.println("Odd Numbers");
		for (int i =9; i>=1; i=i-2) {
			System.out.println(i);
		}
		// 100 to 1 Even
		System.out.println("100 to 1 Odd Numbers");
		for (int i =100; i>=1; i--) {
			if(i%2 != 0) {
			System.out.println(i);
			}
		}
		System.out.println("100 to 0 Even Numbers");
		for (int i =100; i>=0; i--) {
			if(i%2 == 0) {
			System.out.println(i);
			}
		}
	}
}
