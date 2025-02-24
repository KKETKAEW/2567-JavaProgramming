
public class ATMData {
	private String accountNumber;
	private String password;
	
	public void ATMData(String accountNumber,String password) {
		this.accountNumber=accountNumber;
		this.password=password;
	}
	public String getID() {
		return accountNumber;
	}
	public String  getPass() {
		return password;
	}
}
