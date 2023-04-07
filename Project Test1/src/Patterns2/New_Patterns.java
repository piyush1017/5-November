package Patterns2;

public class New_Patterns {
	
	public static void main(String[] args) {
		System.out.println("---Pattern-1---");
		int num=1;
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=num; j++) {
				System.out.print(j+" ");
			}
			num++;
			System.out.println();
		}
		
		System.out.println("---Pattern-2---");
		char alphabet='A';
		
		for(int i=1; i<=5; i++) {
			for(char j='A'; j<=alphabet; j++) {
				System.out.print(j+" ");
			}
			alphabet++;
			System.out.println();
		}
		
		System.out.println("---Pattern-4---");
		int num1=1;
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=num1; j++) {
				System.out.print(num1+" ");
			}
			num1++;
			System.out.println();
		}
		
		System.out.println("---Pattern-5---");
		char alphabet1='A';
		
		for(int i=1; i<=5; i++) {
			for(int j='A'; j<=alphabet1; j++) {
				System.out.print(alphabet1+" ");
			}
			alphabet1++;
			System.out.println();
		}
		
		System.out.println("---Pattern-7---");
		int num2=1;
		int space=4;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=num2; k++) {
				System.out.print(k+" ");
			}
			space--;
			num2++;
			System.out.println();
		}
		
		
		
		System.out.println("---Pattern-8---");
		int num4=5;
		int space2=4;
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=space2; j++) {
				System.out.print(" ");
			}
			for(int k=i; k<=num4; k++) {
				System.out.print(k+" ");
			}
			space2--;
//			num4++;
			System.out.println();
		}
		
		System.out.println("---Pattern-9---");
		int alphabet2='A';
		int space3=4;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=space3; j++) {
				System.out.print(" ");
			}
			for(char k='A'; k<=alphabet2; k++) {
				System.out.print(k+" ");
			}
			space3--;
			alphabet2++;
			System.out.println();
		}
		
		System.out.println("---Pattern-10---");
		char alphabet5='E';
		int space5=4;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=space5; j++) {
				System.out.print(" ");
			}
			for(char k=alphabet5; k<='E'; k++) {
				System.out.print(k+" ");
			}
			space5--;
			alphabet5--;
			System.out.println();
		}
		
		
		
		System.out.println("---Pattern-12---");
		int num3=1;
		int space1=4;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=space1; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=num3; k++) {
				System.out.print(i+" ");
			}
			space1--;
			num3++;
			System.out.println();
		}
		
		System.out.println("---Pattern-13---");
		char alphabet3='A';
		int space4=4;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=space4; j++) {
				System.out.print(" ");
			}
			for(int k='A'; k<=alphabet3; k++) {
				System.out.print(alphabet3+" ");
			}
			space4--;
			alphabet3++;
			System.out.println();
		}
		
		System.out.println("---Pattern-000---");
		int num5=1;
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=num5; j++) {
				System.out.print(i+" ");
			}
			num5++;
			System.out.println();
		}
		
		System.out.println("---Pattern-14---");
		int num8=5;
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=num8; j++) {
				System.out.print(j+" ");
			}
			num8--;
			System.out.println();
		}
		
		System.out.println("---Pattern-15---");
		int num6=1;
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=num6; j--) {
				System.out.print(j+" ");
			}
			num6++;
			System.out.println();
		}
		
		System.out.println("---Pattern-16---");
		int num7=5;
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=num7; j--) {
				System.out.print(j+" ");
			}
			num7--;
			System.out.println();
		}
		
		System.out.println("---Pattern-17---");
		
		int num9=1;
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(num9+" ");
				num9=num9+1;
			}
			System.out.println();
		}
		
		System.out.println("---Pattern-18---");
		char alphabet4='E';
		
		for(int i=1; i<=5; i++) {
			for(char j='A'; j<=alphabet4; j++) {
				System.out.print(j+" ");
			}
			alphabet4--;
			System.out.println();
		}
		
		
	}

}
