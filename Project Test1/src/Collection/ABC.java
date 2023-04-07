package Collection;

public class ABC <G> {
	
	int a;
	G b;
	
	public static void main(String[] args) {
		
		ABC x = new ABC();
		x.a=58;  // Only Integer DataTyape Accept
		System.out.println(x.a);
		
		// All DataType Accept
		x.b="Automation";
		System.out.println(x.b);
		
		x.b=123;
		System.out.println(x.b);
		
		x.b=12.25f;
		System.out.println(x.b);
		x.b='@';
		System.out.println(x.b);
	}
}
