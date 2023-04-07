package InterfaceTesting;

public class Set implements Test {
	
	public void Define() {
		
		System.out.println("Method Define is Running");
	}
	
	public void Setup() {
		
		System.out.println("Method setup is Running");
		
	}
	
	public static void main(String[] args) {
		
		Set x = new Set();
		x.Define();
		x.Setup();
	}

}
