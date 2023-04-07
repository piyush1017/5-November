package Loops;

public class Star {
	
	public static void main(String[] args) {
//		Star Pattern 1
		System.out.println("Star Pattern P1");
		for (int j =1; j<=3; j++) {
		
			for (int i =1; i<=5; i++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
//		Star Pattern Increase
		System.out.println("Increse Stars P2");
		int star = 1;
		for (int j =1; j<=5; j++) {
			for (int i =1; i<=star; i++) {
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
		
//		Start Pattern Decrease
		
		System.out.println("Decrease Stars P3");
		int stars = 5;
		for (int j =1; j<=5; j++) {
			for (int i =1; i<=stars; i++) {
				System.out.print("*");
			}
			System.out.println();
			stars--;
		}
//		Program 4 
		System.out.println("Increse Program 4");
		
		int space = 3;
		int str = 1;
		
		for (int i =1;i<=4;i++) {
			for(int j=1; j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=str;k++) {
				System.out.print("*");
			}
				System.out.println();
				space--;
				str++;
		}
//		Program 5
		System.out.println("Decrease Program 5");
		int spc = 0;
		int st = 4;
		
		for (int i =1;i<=4;i++) {
			for(int j=1; j<=spc;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=st;k++) {
				System.out.print("*");
			}
				System.out.println();
				spc++;
				st--;
		}
		
//		Program 6
		
		
		
		
		
		
		
		
	}

}
