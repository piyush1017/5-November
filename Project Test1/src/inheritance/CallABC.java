package inheritance;

public class CallABC extends ABC{
	
	public void Rest() {
		
		System.out.println("Impelemented Method");
	}
	
	public void Test() {
		System.out.println("Test Method Reimplemented");
	}
	
	public static void Best() {
		System.out.println("Best Method Reimplemented");
	}
	
	public static void main(String[] args) {
		
		CallABC x = new CallABC();
		x.Rest();
		x.Test();
		CallABC.Best();
		
	}

}
