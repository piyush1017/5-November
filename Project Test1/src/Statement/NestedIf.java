package Statement;

public class NestedIf {
	public static void main(String[] args) {
		
		String UN = "xyz";
		String PWD = "123";
		
		if (UN=="xyz") {
			System.out.println("Correct User name");
			if(PWD=="123") {
				System.out.println("Password is correct");
				System.out.println("Login Successful");
			}
			else {
				System.out.println("Password is incorrect");
				System.out.println("Login Failed...");
			}
		}
		else {
			System.out.println("Incorrect Username");
			System.out.println("Login Failed");
		}
		
	}
}
