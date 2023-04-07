package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	
	public static void main(String[] args) {
		
//		Order of insertion RANDOM
		
		HashMap<Integer,String> map = new HashMap();
		
		map.put(11, "Automation"); // multiple null not accept in Key(Only 1 accept) 
		map.put(null, "SQL");      // multiple null accept in Value
		map.put(null, "JAVA");
		map.put(14, null);
		
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			
			System.out.println("Key=" + m.getKey() +"  "+ "Value=" +  m.getValue());
		}
		System.out.println("***********************");
		map.put(65, "API");
		
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			
			System.out.println("Key=" + m.getKey() +"  "+ "Value=" +  m.getValue());
		}
		
	}

}
