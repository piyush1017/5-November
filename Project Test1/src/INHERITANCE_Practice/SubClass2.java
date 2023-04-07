package INHERITANCE_Practice;

public class SubClass2 extends SubClass{

	public void Cycle(){
	
		System.out.println("Cycle");
	}
	
	public static void main(String[] args){
	
		SubClass2 x = new SubClass2();
		
		x.Home();
		x.Car();
		x.Bike();
		x.Money();	
		x.Cycle();
	
	}

}
