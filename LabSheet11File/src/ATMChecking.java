import java.text.DecimalFormat;

public class ATMChecking extends ATMData{
	private int money;
	
	public void  ATMChecking(String accountNumber,String password,int money) {
		 super(accountNumber, password);
	     this.money = money;
	}
	public boolean checkBookBank() {
		return false;
	}
	public void show() throws IOException {
		if(!checkBoolean()) {
			System.out.println("Sorry, your ID or pasword is wrong, or your amount is not enough");
			return;
		}
		DecimalFormat format = new DecimalFormat("#,###.00");
		int thousands = money/100;
		int fiveHundreds=(money%1000)/500;
		int  hundreds=(money%1000%500)/100;  
		System.out.printf("Your drawing for %s, get%n", format.format(money));
		System.out.printf("\t1600 = %d%n", thousands) ;
		System.out.printf("\t500 = %d%n", fiveHundreds);
		System.out.printf("\t160 = 5d%n", hundreds);
		System.out.printf("Your balance is %s Baht.%n", format.format(balance -money) );
	}


}
