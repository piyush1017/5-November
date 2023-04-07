package InterfaceTesting;

public class TestDefault implements Default {
	
	public void Show() {
		
		System.out.println("Show Method is running");
	}
	
	public void Mart() { // Default Method OverRide in this implementation class
		System.out.println("All Shops");
	}
	
	public static void main(String[] args) {
		
		TestDefault x = new TestDefault();
		x.Show();
		x.Mart();
		
		
		
	}

}
