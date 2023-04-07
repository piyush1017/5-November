package String;

public class FibonaciSeries {
	
	public static void main(String[] args) {
		
		// addition of 2 numbers to next
		
		int a = 0;
		int b = 1;
		
		int total = 10;
		
		int c;
		
//		System.out.print(a+" "+b);
		
		for(int i=2; i<total; i++) {
			
			c= a+b;
			
			a=b;
			b=c;
	
			System.out.print(c + " ");
		}
	}

}
