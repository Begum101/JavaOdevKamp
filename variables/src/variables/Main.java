package variables;

public class Main {
	public static void main(String[] args) {
		int ogrenciSayisi = 12;
		String mesaj = "��renci say�s� = ";
		System.out.println(mesaj + ogrenciSayisi);
		
		System.out.println("��renci say�s� = " + ogrenciSayisi); //smells
		System.out.println(mesaj + "12"); //same here
		//always have a dynamic structure
	}

}
