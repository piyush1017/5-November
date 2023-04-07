package Constructor;

public class LocalGlobal {
	
	int a=30; // Global Variable
	
	public void Test() {
		int b=70; // Local Variable
		System.out.println(a);
		System.out.println(b);
	}
	public void Demo() {
		int c=90;
		System.out.println(c); // calling local variable
		System.out.println(a); // calling global variable
//		System.out.println(b); // local variable from another method
//								can't be call
	}
	public static void main(String[] args) {
		
		LocalGlobal x = new LocalGlobal();
		x.Test();
		x.Demo();
	}

}
