package InterfaceTesting;

public class Impliments implements StaticInterface {
	
	public void Show() {
		System.out.println("Method Show is running");
	}
	
	public static void main(String[] args) {
		
		Impliments c = new Impliments();
		c.Show();
		
//		Impliments.xyz;
		
		StaticInterface.xyz();
		
		
	}

}
