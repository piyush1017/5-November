package Collection;

import java.util.HashSet;

public class HashSet1 {
	
	public static void main(String[] args) {
		
//		HashSet <Character> set = new HashSet();
		
		HashSet set = new HashSet();
		
		set.add("String");
		set.add('&');
		set.add(null);
		set.add('$');
		set.add(1234);
		set.add(null);
		
		for(Object s : set) {
			
			System.out.println(s);
		}
		
		
	}

}
