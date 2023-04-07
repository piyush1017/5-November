package Array;

public class MultiDiamentional {
	
	public static void main(String[] args) {
		
		int a[] [] = {{21,22,23},{31,32,33},{41,42,43}};
		
//		int b = a.length;
		
//		System.out.println(b);
		
		for(int i=0; i<=a.length-1; i++) { // 1st iteration
			
			for(int j=0; j<=a.length-1; j++) {
				System.out.print(a[i][j] + " " );
				// i=0 & j=0 then  index(0,0)=21
				// i=0 & j=1 then index(0,1)=22 iteration continues
			}
			// loop khatam hoga tab next line pe jayega
			System.out.println();
		}
	}
//		0	1	2
//	0	21  22  23  (0,0) = 21
//					(0,1) = 22
//	1	31  32  33
//	
//	2	41  42  43
	

}
