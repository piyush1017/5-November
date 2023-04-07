package Casting;

public class TestUpCasting {
	
	public static void main(String[] args) { // override ho raha he
		
		System.out.println("------ Super Class Method -------");
		
		UpCasting x = new UpCasting();
		x.Demo();
		x.Set();
		x.StaticCast();
		
		System.out.println("------ Sub Class Method -------");
		
		UpClast1 y = new UpClast1();
		y.Demo();
		y.Set();
		y.StaticCast();
		y.SubClass();
		
		System.out.println("------ Up Casting Methods -------");
		
		UpCasting z = new UpClast1();
		
		// Super class ref variable = new sub class
		
		z.Demo();
		z.Set();
		z.StaticCast();
		
		
		System.out.println("------ Down Casting Methods -------");
		
		// Not Perform in java 
		// Again inheritance 
		
//		UpClast1 up = (UpClast1) new UpCasting();
//		3
//		 (UpClast1) = sub class name and new super class
//		
//		up.Demo();
//		up.Set();
//		up.StaticCast();
//		up.SubClass();
//		
	}

}
