package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.name = "Telephone";
		product.id =11111;
		product.price = 6500;
		product.desciription ="Xiaomi Redmi Mi 10";
		product.stockAmount =12;
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
	}

}
