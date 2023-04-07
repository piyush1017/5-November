package InterfaceTesting;

public class XYZ implements ABC,DEF{
	
	public void Memo() {
		System.out.println("Memo is Running");
	}
	
	public void Demo() {
		
		int a=80;
		int b=80;
		int c=a+b;
		System.out.println(c);
		
		System.out.println("Demo method is running");
	}
	
	public void Basic() {
		
		System.out.println("Basic method is running");
	}
	
	public void Hard() {
		
		System.out.println("Hard method is running");
	}
	
//	public static void main(String[] args) {
//		
//		XYZ x = new XYZ();
//		x.Memo();
//		x.Demo();
//		x.Basic();
//		x.Hard();
//	}

}
