package variables;

public class Main {
	public static void main(String[] args) {
		int ogrenciSayisi = 12;
		String mesaj = "Öðrenci sayýsý = ";
		System.out.println(mesaj + ogrenciSayisi);
		
		System.out.println("Öðrenci sayýsý = " + ogrenciSayisi); //smells
		System.out.println(mesaj + "12"); //same here
		//always have a dynamic structure
	}

}
