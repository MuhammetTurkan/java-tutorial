package methods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayiBulmaca();
	}
	public static void  sayiBulmaca() {
		int[] sayilar = new int[] {1,2,3,4,5,6};
		int aranacak = 7;
		
		boolean varMi = false;
		
		for(int sayi : sayilar)
		{
			if (aranacak == sayi) {
				varMi =true;
				break;
			}
		}
		if(varMi) {
			System.out.println("Aranacak olan say� mevcut");
		}
		else {
			System.out.println("Aranan say� mevcut de�il");
			
		}
	}
}
