package inheritance;

public class Super1 extends Super123 { // int a = 12;
	
	int a = 15; // Global Variable
	int b = 20;
	
	public void Test() {
		
		int a = 67; // Local Variable
		
		System.out.println(a); // Local Variable from same class
		
		System.out.println(this.a); // Global Variable from same class
		
		System.out.println(super.a); // G.V From another class
	}
	
	public void Best() {
		
		int a = 77; // Local Variable
		
		System.out.println(a); // Local Variable from same class
		
		System.out.println(b);
		System.out.println(super.b);
		
		System.out.println(this.a); // Global Variable from same class
		
		System.out.println(super.a); // G.V From another class
	}
	
	public static void main(String[] args) {
		
		Super1 x = new Super1();
		
		x.Test();
		x.Best();
	}

}
