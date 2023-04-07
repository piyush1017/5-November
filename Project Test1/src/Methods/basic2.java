package Methods;

public class basic2 { // Non static method declare in same class
					  // and call in same class
	
	public void Demo() { // User defined non static method declare
		System.out.println("Demo method is running");
	}
	
	public static void Test() { // UD static method
		System.out.println("Test method is running");
	}
	
	public static void main(String[] args) {
		basic2 x = new basic2();
		x.Demo(); // Non static method calling same class
		
		Test(); // static method calling same class
		basic1.Demo();
		basic1.Test();
		
		
	}

}
