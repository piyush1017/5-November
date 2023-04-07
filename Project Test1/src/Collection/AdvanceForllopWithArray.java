package Collection;

public class AdvanceForllopWithArray {
	
	public static void main(String[] args) {//  Advance for loop
		
		int [] number = {12,23,34,45,56};
		
		for(int num : number) {
			
			System.out.println(num);
		}
		
//		for(int i=0; i<=number.length-1; i++) {
//			System.out.println(number[i]);
//		}
		
		System.out.println("-----------For Charecter---------");
		
		char [] alphabet = {'a','b','c','d','e'};

		for(char alph : alphabet) {
			
			System.out.println(alph);
		}
		
		System.out.println("-----------For Addition---------");
		
		int no [] = {10,20,30,40,50};
		
		int addition = 0;
		
		for(int num : no) {
			
			addition += num;
			
		}
		System.out.println("Addition=" + addition);
	}

}

// here num = is ref variable
// number = array isme store ho raha he
// int = dataType

