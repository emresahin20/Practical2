package methods;

public class Main {

	public static void main(String[] args) {
		sayıBulmaca();
	}

	public static void sayıBulmaca() {
		int[] sayılar = new int[] { 1, 2, 3, 5, 9, 6, 3 };
		int aranacak = 4;
		boolean varMı = false;

		for (int sayı : sayılar) {
			if (sayı == aranacak) {
				varMı = true;
				break;
			}
		}
		if (varMı) {
			mesajVer("Sayı Mevcuttur: " + aranacak);
		} else {
			mesajVer("Sayı Mevcuttur Değildir: " + aranacak);
		}

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);

	}
}
