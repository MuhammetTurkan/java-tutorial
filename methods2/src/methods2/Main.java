package methods2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mesajVer();
		String mesaj = mesajVer2();
		System.out.println(mesaj);
		
		System.out.println(topla());
		int toplamSayi = topla2(15,20);
		System.out.println(toplamSayi);
		
		
		int toplam = topla2(2,3,4,5,6,7,8,9,10);
		System.out.println(toplam);
	}
	public static void mesajVer() {
		System.out.println("Bir mesaj verildi.");
	}
	public static String mesajVer2() {
		return "Bir mesaj daha verildi.";
	}
	
	
	public static int topla() {
		return 5+10;
	}
	
	public static int topla2(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	// Variable Arguments
	public static int topla2(int... sayilar) {
		int toplam=0 ;
		for (int sayi : sayilar) {
			toplam+= sayi;
		}
		
		return toplam;
	}
	
}
