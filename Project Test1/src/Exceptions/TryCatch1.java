package Exceptions;

public class TryCatch1 {
	
	public static void main(String[] args) {
		
		int a = 20;
		int b=0;
		int c=0;
		int d[] = {12,23,34,45,56,67};
			 System.out.println("Before try block code Start");
		
		try { // yaha pe hamne exception generate kiya (event generate hua he)
			System.out.println("try block Rsky Code");
//			b=5; // exception generate nahi hoga
			System.out.println(d[6]);  // event(exception) generated
			b=0; // Arithmatic exception ko handle kar raha he try & catch
			c=a/b; // Here is risky code
			
			// pure life me try block me compliler 1 hi bar jata he
			//  1 try block 1 hi exception handle karta he
		}
		catch(ArithmeticException e){ // har try ke bad catch block jaruri he
			//here e ka ref diya he
			
			b=2;
			c=a/b;  // ye dono b and c alternative code he. jo catch me dena padta he
					// yaha pe alternative code use kar ke use handle kiya he
			
			System.out.println("Alternative code of Arithmatic");
		}
		
		catch(ArrayIndexOutOfBoundsException e ){ 
			// e ==> exception jo generate hota he vo e ref variable me save hota he
			System.out.println("Alternative code of Array");
			System.out.println(d[3]); // corrected code for handle exception
		}
		
		finally {
			System.out.println("Finally block executed");
		}
		
		System.out.println(c); // Normal flow
	}
}

//IMP questions in Interview
// exception generated and not get handle ==> try block & finally execute hoga.

// exception generated get handles ==> try and catch and FInally and normal flow execute hoga.

// exception not generated ==> try block and finally and normal flow executed.
    	//yaha pe exception genearte hi nahi hua he to catch block ayega hi nahi.

// Permitation and combinations (means konsa block kab le sakte he)

		//1. try ke bad multiple catch block likh sakte he.
		//2. try ke bad catch and catch ke andar catch nahi likh sakte = error ayega
		//3. try - catch - catch and is catch ke andar fir se try & catch dal sakte he.
		//4. try ke andar try & catch likh sakte he but practically required nahi he
				// ==> life time me 1 hi bar ata he isliye (fir se nahi ayega)

// ham 1 try block me kabhi multiple exception nahi likhte hamesha alag try and catch
	// lete he ex try catch , try catch, try catch
	