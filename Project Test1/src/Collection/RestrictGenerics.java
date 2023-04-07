package Collection;

public class RestrictGenerics <G> {
	
	int a;
	G b;
	
	public static void main(String[] args) { // yaha pe generics ko bhi restrict kar 
											 // sakte he.
		
		RestrictGenerics <Integer> x = new RestrictGenerics <Integer>();
		
		x.a=55;
		System.out.println(x.a); // only integer accept
		
//		x.a=52.25f;
//		System.out.println(x.a); // no accept other data type
		
		x.b=10;
		System.out.println(x.b);
		
		RestrictGenerics <String> y = new RestrictGenerics <String>();
		
		y.b="Automation";
		System.out.println(y.b);
		
		
	}

}
