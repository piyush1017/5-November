package String;

public class Reverse {
	
	public static void main(String[] args) {
		
		
		String a = "Rashmika";
		// string a reverse hogi to kisi new variable me store hogi
		// kyonki new string store hogi reverse karege tab
		
		String reverse = ""; // empty he is me reverse wala lane wale he
		
		
		for(int i=a.length()-1;i>=0; i--) {
			
			// a.length()-1 = last index se lega start
			
			reverse = reverse + a.charAt(i); // concat kiya he 
			// reverse + kiya kyonki usime age store karega
			// reverse name ke variable me store kar rahe he
		}
		System.out.println(reverse);
	}
	
	

}
