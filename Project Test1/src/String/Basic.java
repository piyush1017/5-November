package String;

public class Basic {
	
	public static void main(String[] args) {
		
		String a = "velocity";
		String b = "velocity";
				// Here reference 2 but object create is 1
		
		String c = new String ("VELOCITY");
		String d = new String ("VELOCITY");
				// Here reference 2 but object create is 2
		
		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println(a==c);
		
		System.out.println("---------------------------");
		
		b="Testing";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
		
		System.out.println("---------------------------");
		//Cross verify
		b = "velocity";
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
	}

}
