package switchDemo;

public class Main {
	public static void main(String[] args) {
		char grade = 'F';
		
		switch(grade) {
		case 'A':
			System.out.println("Kusursuz, ge�tiniz !");
			break;
		case 'B':
			System.out.println("G�zel, ge�tiniz !");
			break;
		case 'C':
			System.out.println("�yi, ge�tiniz !");
			break;
		case 'D':
			System.out.println("�dare eder, ge�tiniz !");
			break;
		case 'F':
			System.out.println("Kald�n�z...");
			break;
			default:
				System.out.println("Ge�ersiz not girdiniz.");
		}
	}
	
	//case sensitive

}
