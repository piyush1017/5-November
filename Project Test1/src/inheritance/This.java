package inheritance;

public class This { // this keyword
	
	int a = 75; // Global Variable
	
	public void Test() {  // Static method nahi le sakte
		
		int a = 58; // Local Variable
		
		System.out.println(a);
		
		System.out.println(this.a);
		
	}
	
	public void Basic() {
		
		int a = 23; // Local Variable
		
		System.out.println(a); // local 23
		
		System.out.println(this.a);
	}
	
	public static void main(String [] args) {
		
		This x = new This();
		x.Test();
		x.Basic();
	}
}
