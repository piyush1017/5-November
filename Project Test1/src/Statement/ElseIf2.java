package Statement;

public class ElseIf2 { // lader if
	
	public static void main(String[] args) {
		
		String Projectdomain = "Healthcare";
		
		if(Projectdomain == "Healthcare") {
			System.out.println("medical related work");
		}
		else if (Projectdomain=="Banking") {
			System.out.println("Money transaction related work");
		}
		else if (Projectdomain== "Telecome") {
			System.out.println("Communication related work");
		}
		else if (Projectdomain=="Booking Portal") {
			System.out.println("Works releted to Ticket booking");
		}
		else {
			System.out.println("Random project domain");
		}
	}

}
