package AbstractEncapsulGeneralis;

public class Encapsulation {
	
	private int a = 50; //declare data member (variable) as private
	private int b = 20;
	
	Encapsulation(){
		
		a=80;
		b=64;
	}

    Encapsulation(int c, int d){
		
		a=c;
		b=d;
	}
    
    public void Demo() {  // method ke andar wrap kiya
    	int c = a+b;
    	System.out.println(c);
    }
    
    public static void main(String[] args) {
		
    	Encapsulation x = new Encapsulation();
    	x.Demo();
	}
}
