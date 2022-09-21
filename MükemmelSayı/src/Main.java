
public class Main {

	public static void main(String[] args) {
		// mükemmel sayı:pozitif tam bölen sayıların toplamı kendisine eşit olan sayılardr.
		int toplam = 0;
		int sayı = 28 ;
		for(int i=1;i<sayı;i++) {
			if(sayı%i ==0)
				toplam=toplam+i;
		}
		if(toplam==sayı) {
			System.out.println("mükemmel sayıdır.");
		}
		else {
			System.out.println("mükemmel sayı değildir.");
		}
	}

}
