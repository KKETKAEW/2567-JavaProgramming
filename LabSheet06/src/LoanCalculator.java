class LoanCalculate{
	private String name;
	private double price;
	private double interestRate;
	private int years;
	
	public void setLoanDetails(String productName, double productPrice, double rate, int year) {
		name = productName;
		price = productPrice;
		interestRate = rate;
		years = year;
	}
	public double calculateMonthlyPayment() {
		double monthlyRate = interestRate / 12 / 100;
        int totalMonths = years * 12;
        return (price * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -totalMonths));
	}
	
	public void displayLoanDetails() {
		System.out.println("Product: "+name);
		System.out.println("Price: "+price);
		System.out.println("Interest Rate: "+interestRate+"%");
		System.out.println("Loan Period: "+years+" years");
		System.out.printf("Monthly Payment: %.2f",calculateMonthlyPayment());
		
	}
}