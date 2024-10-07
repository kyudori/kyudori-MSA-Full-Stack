package day10;

public class ProductTest {

	public static void main(String[] args) {
		
        Product[] products = new Product[5];
        
        products[0] = new Product();
        products[1] = new Product("TV", 10, 1500000);
        products[2] = new Product("Laptop", 7, 1200000);
        products[3] = new Product("Smartphone", 15, 900000);
        products[4] = new Product("Tablet", 20, 500000);

        System.out.println("상품명\t재고량\t가격");
        for (Product product : products) {
            System.out.println(product.getName() + "\t" + product.getBalance() + "\t" + String.format("%,d원", product.getPrice()));
        }
	}

}
