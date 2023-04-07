package Loops;

public class DiomondStar {
	public static void main(String[] args) {
		System.out.println("Programm -- 1");
		int space=3;
		int star=1;
		
		for (int i=1; i<=7; i++) {
			for(int j=1; j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=star;k++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<=3) {
				space--;
				star=star+2;
			}
			else {
				space++;
				star=star-2;
			}

		}
		
	}
}
