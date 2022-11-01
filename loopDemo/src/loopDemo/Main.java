package loopDemo;

public class Main {
	public static void main(String[] args) {
		//For
		for(int i = 0; i < 10; i+=2) { //even numbers
			System.out.println(i);
		}
		
		for(int i = 1; i < 10; i+=2) { //odd numbers
			System.out.println(i);
		}
		
		System.out.println("For döngüsü bitti.");
		
		//While
		int i = 1;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("While döngüsü bitti.");
		
		//Do-while
		int j = 1;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		
		System.out.println("Do-while döngüsü bitti.");	
	
	}
}
