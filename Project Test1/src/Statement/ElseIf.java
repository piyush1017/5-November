package Statement;

public class ElseIf {
	
	public static void main (String [] args) {
		
		int studentMarks = 80;
		
		if (studentMarks >= 70) {
			System.out.println("Student Pass In Distinction");
		}
		else if (studentMarks >=60) {
			System.out.println("Student Pass In First Class");
		}
		else if (studentMarks >=50) {
			System.out.println("Student Pass In second Class");
		}
		else if (studentMarks >=35) {
			System.out.println("Student Pass");
		}
		else {
			System.out.println("Fail");
		}
	
	}

}
