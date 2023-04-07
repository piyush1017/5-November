package Statement;

public class IfElse {
	
	public static void main (String [] args) {
		
//		Program 1
		int marks = 60;
		System.out.println("*Program 1*");
		if (marks>50) {
			System.out.println("std pass");
		}
		else {
			System.out.println("std fail");
		}
		
//		Program 2
		int sub = 5;
		System.out.println("*Program 2*");
		if (sub == 5) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
//		Program 3
		int a = 100;
		System.out.println("*Program 3*");
		
		if (a!=5 ) {
			System.out.println("a is not Equal");
		}
		else {
			System.out.println("a is Equal");
		}
		
//		Program 4
		int total = 100;
		System.out.println("*Program 4*");
		if ((total>99) && (total>=30)) {
			System.out.println("Total is Greater ");
		}
		else {
			System.out.println("False");
		}
		
//		Program 5
		int c = 5, b = 20;
		System.out.println("*Program 5*");
		
		if ((c>25) && (b<10)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
//		Program 6
		int mark = 100;
		System.out.println("*Program 6*");
		if((mark != 100) || (mark > 50)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
//		Program 7
		int studentPass = 10;
		System.out.println("*Program 7*");
		if ((studentPass >15) || (studentPass==20)) {
			System.out.println("Student Paas more than 10");
		}
		else {
			System.out.println("Student pass less than 10");
		}
		
	}

}
