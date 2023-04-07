package Collection;

import java.util.ArrayList;

public class AllCollection {
	
	// Sabse pahele ArrayList ka object create karna padega.
	// ArrayList 1 class he.
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		// ArrayList ko restrict kiya he with dataType
		
		list.add(123);  // Order of insertion maintain karta he.
		list.add(456);
		list.add(789);
		list.add(1234);
		
		int size = list.size();
		System.out.println(size);
		
		for(int i=0; i<=list.size()-1; i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("*************************************");
		
		list.remove(1);
		
		for(int i=0; i<=list.size()-1; i++) {
			System.out.println(list.get(i));
		}
	}
	
	
	
}
