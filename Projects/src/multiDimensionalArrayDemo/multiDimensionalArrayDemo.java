package multiDimensionalArrayDemo;

public class multiDimensionalArrayDemo {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Denizli";
		sehirler[0][2] = "Aydın";
		
		sehirler[1][0] = "İzmir";
		sehirler[1][1] = "Kütahya";
		sehirler[1][2] = "Trabzon";
		
		sehirler[2][0] = "Kilis";
		sehirler[2][1] = "Antalya";
		sehirler[2][2] = "Muğla";

		for (int i = 0; i <= 2; i++) {

			System.out.println("--------------------");
			for (int j = 0; j <= 2; j++) {

				System.out.println(sehirler[i][j]);
			}
		}

	}

}
