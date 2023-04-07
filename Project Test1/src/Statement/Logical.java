package Statement;

public class Logical {
	public static void main(String[] args) {
		
//		Logical AND
		System.out.println("Logocal AND");
		
		System.out.println((10>5) && (2<3));
		System.out.println((25>20) && (10<15));
		System.out.println((50>30) && (75<25));
		
//		Logical OR
		System.out.println("Logical OR");
		
		System.out.println((40<10) || (30>10));
		System.out.println((5>10) || (20<15));
		System.out.println((50>=50) || (25<=20));
		System.out.println((15<=10) || (20>=30));
		
//		Logical NOT
		System.out.println("Logical NOT");
		System.out.println((5!=10));
		System.out.println((!(5==7)));
		System.out.println(!(10>5));
	}

}
