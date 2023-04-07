package Polymorphism;

public class Riding2 extends Riding {

	public void Statement() {
		
		System.out.println("Method from sub class is running");
	}
	
	public static void Test() {
		
		System.out.println("Test running");
	}
	
	public static void main(String[] args) {
		
		Riding2 x = new Riding2();
		x.Statement();
		Riding2.Test();
		
//		Riding z = new Riding(); // Here we cant achive inheritance
//		z.Statement();
		
		Riding y = new Riding2(); // Here ref of supar cla (def of run time poly)
		y.Statement(); // Exactly here do overriding (exactly polympsm ye he esa batana)
	}
}
