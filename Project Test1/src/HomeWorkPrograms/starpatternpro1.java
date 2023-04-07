package HomeWorkPrograms;

public class starpatternpro1 {
	public static void main(String[] args) {
		System.out.println("Pattern 1");
	
		int star=1;
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			star++;
			System.out.println();
		}
		
		System.out.println("Pattern 2");
		
		int st=1;
		int space=4;
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=st; k++)
			{
				System.out.print("*");
			}
			st++;
			space--;
			System.out.println();
		}
		
		System.out.println("Pattern 3");
		
		int star3=5;
		//int space3=4;
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=star3; j++)
			{
				System.out.print("*");
			}
			star3--;
			
			System.out.println();
		}
		
		System.out.println("Pattern 4");
		int star4=5;
		int space4=0;
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=space4; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star4; k++)
			{
				System.out.print("*");
			}
			star4--;
			space4++;
			System.out.println();
		}
		
		System.out.println("Pattern 5");
		
		int star5=1;
		int space5=4;
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=space5; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star5; k++)
			{
				System.out.print("*");
			}
			star5=star5+2;
			space5--;
			System.out.println();
		}
		
		System.out.println("Pattern 6");
		
		int star6=9;
		int space6=0;
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=space6; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star6; k++)
			{
				System.out.print("*");
			}
			star6=star6-2;
			space6++;
			System.out.println();
		}
		
		System.out.println("Pattern 7");
		
		int star7=1;
		int space7=4;
		
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=space7; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star7; k++)
			{
				System.out.print("*");
			}
			if(i<=4)
			{
				star7=star7+2;
				space7--;
			}
			else
			{
				star7=star7-2;
				space7++;
			}
			System.out.println();
		}
		
		System.out.println("Pattern 8");
		
		int star8=1;
		
		
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=star8; j++)
			{
				System.out.print("*");
			}
			if(i<=4)
			{
				star8++;
				
			}
			else
			{
				star8--;
			}
			System.out.println();
		}
		
		System.out.println("Pattern 9");
		
		int star9=1;
		int space9=4;
		
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=space9; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star9; k++)
			{
				System.out.print("*");
			}
			if(i<=4)
			{
				star9++;
				space9--;
				
			}
			else
			{
				star9--;
				space9++;
			}
			System.out.println();
		}
		
		System.out.println("Pattern 10");
		
		int space10=4;
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=space10; j++)
			{
				System.out.print(" ");
			}
			System.out.println("*****");
			space10--;
			
		}
		
		System.out.println("Pattern 11");
		
		int space11=0;
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=space11; j++)
			{
				System.out.print(" ");
			}
			System.out.println("*****");
			space11++;
			
		}
		
		System.out.println("Pattern 12");
		
		int star12=5;
		
		
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=star12; j++)
			{
				System.out.print("*");
			}
			if(i<=4)
			{
				star12--;
				
			}
			else
			{
				star12++;
			}
			System.out.println();
		}
		
		System.out.println("Pattern 13");
		
		int star13=5;
		int space13=0;
		
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=space13; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star13; k++)
			{
				System.out.print("*");
			}
			if(i<=4)
			{
				star13--;
				space13++;
				
			}
			else
			{
				star13++;
				space13--;
			}
			System.out.println();
		}
		
		System.out.println("Pattern 14");
		
		int star14=9;
		int space14=0;
		
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=space14; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star14; k++)
			{
				System.out.print("*");
			}
			if(i<=4)
			{
				star14=star14-2;
				space14++;
			}
			else
			{
				star14=star14+2;
				space14--;
			}
			System.out.println();
		}
		
		System.out.println("Pattern 15");
		
		int star16=1;
		for(int i=1; i<=5;i++) {
			for(int j=1; j<=star16; j++) {
			
				if(j==1 || j==i || i==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			star16++;
			System.out.println();
			
		}
		System.out.println("Programm 16");
		for(int i=1; i<=5;i++) {
			for(int j=5; j>=1; j--) {
			
				if(j==1 || j==i || i==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		 System.out.println(10 + 20 + "Javatpoint");   
	        System.out.println("Javatpoint" + 10 + 20);
	        
	    System.out.println("Program 18");
	
	    int star0=1;
		int space8=4;
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=space8; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star0; k++)
			{
				System.out.print("* ");
			}
			star0=star0+1;
			space8--;
			System.out.println();
		}
		
		System.out.println("Program 19");
		
	    int star10=1;
//		int space15=4;
		
		for(int i=1; i<=5; i++)
		{
//			for(int j=1; j<=space15; j++)
//			{
//				System.out.print(" ");
//			}
			for(int k=1; k<=star10; k++)
			{
				System.out.print("* ");
			}
			
			star10=star10+1;
			System.out.println();
		}
	}

}
