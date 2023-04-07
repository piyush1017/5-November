package Loops;

public class Star2 {
	public static void main(String[] args) {
		System.out.println("Programm -- 1");
		int space=3;
		int star=1;
		
		for (int i=1; i<=4; i++) {
			for(int j=1; j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=star;k++) {
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;
		}
		System.out.println("Programm -- 2");
		int spc=0;
		int str=7;
		
		for (int i=1; i<=4; i++) {
			for(int j=1; j<=spc;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=str;k++) {
				System.out.print("*");
			}
			System.out.println();
			spc++;
			str=str-2;
		}
	}

}
