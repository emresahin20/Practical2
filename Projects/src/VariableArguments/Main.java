package VariableArguments;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bu gün hava çok güzel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayı = topla(5, 7);
		System.out.println(sayı);
		int toplam=topla2(1,1,3,4,2,12,32);
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void güncelle() {
		System.out.println("güncellendi");
	}

	public static void sil() {
		System.out.println("silindi");
	}

	public static int topla(int sayı1, int sayı2) {
		return sayı1 + sayı2;
	}
	public static int topla2(int... sayılar) {
		int toplam=0;
		for(int sayı:sayılar) {
			toplam += sayı;
		}
		return toplam;
		
	}

	public static String sehirVer() {
		return "Ankara";
	}
	

}
