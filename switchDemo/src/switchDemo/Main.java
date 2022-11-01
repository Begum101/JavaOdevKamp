package switchDemo;

public class Main {
	public static void main(String[] args) {
		char grade = 'F';
		
		switch(grade) {
		case 'A':
			System.out.println("Kusursuz, geçtiniz !");
			break;
		case 'B':
			System.out.println("Güzel, geçtiniz !");
			break;
		case 'C':
			System.out.println("Ýyi, geçtiniz !");
			break;
		case 'D':
			System.out.println("Ýdare eder, geçtiniz !");
			break;
		case 'F':
			System.out.println("Kaldýnýz...");
			break;
			default:
				System.out.println("Geçersiz not girdiniz.");
		}
	}
	
	//case sensitive

}
