package INHERITANCE_Practice;

public class Check implements A,B {
	
	public void Best() {
		System.out.println("Best");
	}
	
	public void Test() {
		int a=50;
		int b=20;
		int c = a+b;
		
		System.out.println(c);
	}
	
	public void Rest() {
		System.out.println("Rest");
	}
	
//	public static void Basic() {
//		System.out.println("Basic");
//	}
	
	public static void main(String[] args) {
		
		Check x = new Check();
		
		x.Best();
		x.Test();
		x.Rest();
//		Check.Basic();
//		B.Basic(); // Call with interface name only
				   // We can not call with Implementation class name
					// Becoz we can not override or hide static method
	}

}
