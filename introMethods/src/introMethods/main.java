package introMethods;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			System.out.println("Aranacak olan sayý mevcut");
		}
		else {
			System.out.println("Aranan sayý mevcut deðil");
			
		}

	}

}
