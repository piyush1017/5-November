package ArrayPractice;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int a [] = {10,45,5,25,55,30};
		
		System.out.println("----Reverse-----");
		for(int i= a.length-1; i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

}
