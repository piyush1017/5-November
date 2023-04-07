package String;

public class Armstrong {
	
	public static void main(String[] args) {
		
		// Armstrong Number 371, 153, 370, 407, 1634, 8208, 9474
		
		int orig = 153; // 1 + 125 + 27 = 153
						// 1634
		
		int add = 0; // reminder jitna ayega use 3 bar multiply karege yani qube
		
		for(int i =orig; i>0; i=i/10) { // 153/10 = Q 15, reminder 3
			
			int reminder = i%10; // 3
			
			add = add + (reminder*reminder*reminder);
				// 0 + (3*3*3)  
				// 0 + (5*5*5)
				// 0 + (1*1*1)
			System.out.println(add);
		}
		if(orig==add) {
			System.out.println("Given Number Is Armstrong Number");
		}
		else {
			
			System.out.println("Given Number is Not Armstrong Number");
		}
		
		
	}

}
