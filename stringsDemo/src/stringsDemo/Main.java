package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		/*System.out.println("Eleman sayısı : " + mesaj.length());
		System.out.println("5. eleman : " + mesaj.charAt(4));//karakter dizisindeki 4. elemanı bulur
		System.out.println(mesaj.concat(" yaşasın!"));//var olan bir stringe ekleme yapar ama bir başka değişkene atanması gerekir
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("A"));//Eğer ilgili string a harfiyle başlıyorsa true değer döndürür
		System.out.println(mesaj.endsWith("."));//Eğer ilgili string nokta ile bitiyorsa true değer döndürür
		char[] karakterler = new char[5];
		mesaj.getChars(0, 4, karakterler, 0);//ilgili stringin 0'ıncı karakterinden başlayarak 4'üncü karaktare kadar al ve karakterler isimli karakter dizisiner aktar
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("ü"));//ilgili karakter stringin içinde var mı varsa kaçıncı indeksinde
		System.out.println(mesaj.lastIndexOf("ü"));//ilgili karakteri karakter dizisinde arar ve 
		*/
		
		System.out.println(mesaj.replace(' ', '-'));//strindeki ilgili karakterle başka bir karaqkteri değiştirir ynei bir string oluşturacağından bir değişkene aktarmak gerekir
		System.out.println(mesaj.substring(2,4));//stringdeki iligili indeksinden itibaren alır
		
		for(String kelime : mesaj.split(" ")) {//stringi ilgili karakterlerden parçalar
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());//stringdeki tüm harfleri küçültür
		System.out.println(mesaj.toUpperCase());//stringdeki tüm harfleri büyütür
		System.out.println(mesaj.trim());//stringin başında ve sonunda boşluk varsa bu boşlukları temizler
		
	}

}
