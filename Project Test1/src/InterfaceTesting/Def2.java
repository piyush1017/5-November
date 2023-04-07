package InterfaceTesting;

public class Def2 implements Default {
	
	public void Show() {
		
	}
	
	public static void main(String[] args) {
		
		Def2 z = new Def2();
		z.Mart(); // Default to method maintain common code or common property 
					// for all implementation class
	}
}
