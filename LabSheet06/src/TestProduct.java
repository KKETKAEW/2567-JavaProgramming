public class TestProduct {
 
	public static void main(String[] args) {
		Product prod = new Product();
		prod.setProductDetails("Smartphone", 30000.0, 7.0);
		
		System.out.println("Product Details:");
		prod.displayProductDetails();
		
		
 
	}
 
}