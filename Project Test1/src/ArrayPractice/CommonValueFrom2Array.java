package ArrayPractice;

public class CommonValueFrom2Array {
	
	public static void main(String[] args) {
		
		int a[] = {10, 40, 30, 50, 90,20};
		
		int b[] = {90, 70, 60, 35, 10, 25};
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=0; j<b.length; j++) {
				
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
//				else {
//					System.out.println("No Common");
//				}
			}
			
		}
	}

}
