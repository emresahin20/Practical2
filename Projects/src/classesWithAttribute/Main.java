package classesWithAttribute;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1,"Macbook Pro","M2 İşlemci",100,35000,"kırmızı");
		
		Product product2 = new Product();
		product2.setId(13321321);
		product2.setName("MacBook Air");
		product2.setDescription("M1 İşlemci");
		product2.setStockAmount(122);
		product2.setPrice(28000);

		ProductManager productManager = new ProductManager();

		productManager.add(product1,product2);
		System.out.println(product1.getKod());
	}

}
