package Collection;

public class MethodGeneric <G, L> {
	
	G b;
	
	G demo(L x) {
		System.out.println(x);
		return b;
		
	}
	
	public static void main(String[] args) {
		
		MethodGeneric <Integer, String> y = new MethodGeneric <Integer, String>();
		
		y.b=890;
		
		// ye niche ka code ham kabhi bhi use nahi karte pure selenium me
		// Developer use karte he
		int z = y.demo("Automation");
		System.out.println(z);
	}
}
