package miniProjeAsalSayi;

public class Main {
	
	public static void main(String[] args) {
		int number = -3;
		int remainder = number % 2;
		boolean isPrime = true;
		
		if(number == 1) {
			System.out.println("Say� asal de�ildir");
			return;
		}
		
		if(number < 2) {
			System.out.println("Ge�ersiz say�");
			return;
		}
		
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("Asal say�");
		} else {
			System.out.println("Asal say� de�il");
		}
		
	
	}

}
