package miniProjectAsalSayı;

public class Main {

	public static void main(String[] args) {
		int number = 17;		
		boolean sonuç = true;
		for(int i=2;i<number;i++) {
			int remainder = number % i;
			if(remainder == 0) {
				sonuç = false;
			}
		}
		if(sonuç == true) {
			System.out.println("sayı asaldır.");
		}
		else {
			System.out.println("sayı asal değildir.");
		}
			
	}

}
