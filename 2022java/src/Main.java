
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		int sayi = 12;
		String isim = "akif";
		System.out.println(sayi);
		//for döngüsü
		for(int i=1;i<5;i++) {
			System.out.println(sayi);
		}
		
		// en büyük sayı bulma 
		
		int sayi1 = 70;
		int sayi2 = 16;
		int sayi3 = 70;
		
		int enBuyuk = sayi1;
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("en büyük sayı :" + enBuyuk);
		
		// diziler
		
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Ahmet";
		ogrenciler[1] = "Akif";
		ogrenciler[2] = "Munise";
		
		for (int j=0;j<ogrenciler.length;j++) {
			System.out.println(ogrenciler[j]);
		}
		
		
		System.out.println("---------------");
		// aynı for döngüsü ile fakat daha sık kullanılan bir yöntem aşagıdaki gibidir.
		//Aşağıdaki kod ogrenciler dizisinin içindeki bütün verileri döndürür.
		for (String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		// sayılardan oluşan bir dizi denemesi :
		
		int yaşlar[]=new int[3];
		yaşlar[0]=15;
		yaşlar[1]=25;
		yaşlar[2]=35;
		
		for(int yaş:yaşlar) {
			System.out.println(yaş);
		}
		
		//recap demo 2
		//bir double dizisi oluşturup bu dizi içerisindeki elemanları , toplamlarını
		//ve en büyüğünü bulma
		System.out.println("+++++++++++++++++++++++++++");
		
		double[] myList = new double[4];
		myList[0] = 1.5;
		myList[1] = 2.47;
		myList[2] = 7.45;
		myList[3] = 44.5;
		double total = 0;
		double max = 0;
		
		for(double number:myList) {
			if(max<number) {
				max=number;
			}
			total = total+number;
			System.out.println(number);
		}
		System.out.println("sayıların toplamı = "+total);
		System.out.println("sayıların en büyüğü = "+max);
		
		//multiDimensionalArrays
				
		String[][] şehirler = new String[2][2];
		şehirler[0][0] = "izmir";
		şehirler[0][1] = "manisa";
		şehirler[1][0] = "aydın";
		şehirler[1][1] = "balıkesir";
		
		for(int i=0;i<=1;i++) {
			System.out.println("-+-+-+-+-+-+-+-+-+-+-+-");
			for(int j=0;j<=1;j++) {
				System.out.println(şehirler[i][j]);
			}
		}
		System.out.println("+++++++++++++++++++++++++++");
		//stringlerle çalışma
		
		String mesaj = "Bugün hava çok güzel.";
		/*
		System.out.println(mesaj);
		System.out.println("eleman sayısı : "+mesaj.length());
		System.out.println("5.eleman : "+mesaj.charAt(4));
		System.out.println(mesaj.concat("Yaşasın!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("n"));
		char[]karakterler = new char[8];
		mesaj.getChars(0, 8, karakterler,0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a")); */
		
		System.out.println(mesaj.replace(" ","-"));
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,5));
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		
		
		
		
		
		
	}

}
