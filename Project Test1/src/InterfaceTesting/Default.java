package InterfaceTesting;

public interface Default {
	
	
	// Default method of interface
	// Default is a keyword not access specifier
	// Mart method is by default public
	
	public default void Mart () { // Default method
		
		System.out.println("Shops");
	}
	
	public static void XYZ() { // Complete static method
		
		System.out.println("Static method of interface id running..");
	}
	
	public void Show(); // Incomplete method of interface

}
