package recapDemo1;

public class Main {
	
	public static void main(String[] args) {
		
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;
		int biggest = 0;
		
		int[] sayiArray = new int[] {sayi1,sayi2,sayi3};
		
		
		for(int i=0; i<= sayiArray.length-2; i++) {
			if(sayiArray[i+1]>sayiArray[i]) {
				biggest = sayiArray[i+1];
			}else {
				biggest = sayiArray[i];
			}
		}
		
		System.out.println(biggest);
		
	}

}