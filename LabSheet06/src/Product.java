class Product{
	private String name;
	private double price;
	private double vatRate;
	
	public void setProductDetails(String nameProduct, double priceProduct, double vat) {
		name = nameProduct;
		price = priceProduct;
		vatRate = vat;
	}
	public double calculateTotalPrice() {
		return price + (price * vatRate / 100);
	}
	public void displayProductDetails() {
		System.out.println("Product Name: "+name);
		System.out.println("Price (Before VAT):"+price);
		System.out.println("Price (After VAT):"+calculateTotalPrice());
	}
}