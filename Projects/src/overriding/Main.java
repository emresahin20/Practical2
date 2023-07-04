package overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] krediler = new BaseKrediManager[] { new TarımKrediManager(), new OgretmenKrediManager(),
				new OgrenciKrediManager() };

		for(BaseKrediManager krediManager:krediler) {
			System.out.println(krediManager.Hesapla(1000));
		}
	}

}
