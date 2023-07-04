package switchDemo;

public class switchDemo {

	public static void main(String[] args) {
		char grade ='A';
	
		switch(grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz.");
		break;
		case'B':
			System.out.println("İyi : Geçtiniz.");
			break;
		case'C':
			System.out.println("orta : Geçtiniz.");
			break;
		case 'E':
			System.out.println("Kötü : Kaldınız.");
			break;
			default:
				System.out.println("Geçersiz Not Girdiniz.");
			
		}
	}

}
