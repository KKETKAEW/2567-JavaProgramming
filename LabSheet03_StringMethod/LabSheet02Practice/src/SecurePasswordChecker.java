import java.util.Scanner;
public class SecurePasswordChecker {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Enter your password(type 'exit' to quit) :");
			String password = scan.nextLine();
			
			if(password.equalsIgnoreCase("exit")) {
				System.out.println("Program terminated.");
				break;
			}
			String error="";
			
			if(password.length()<8) {
				error += "- Password must be at least 8 characters long.\n";
			}
			
			boolean hasUpperCase = false;
			boolean hasLowerCase = false;
			boolean hasDigit = false;
			
			for(int i = 0; i<password.length();i++) {
				char ch = password.charAt(i);
				if(ch>='A' && ch<='Z') {
					hasUpperCase = true;
				}else if (ch>='a' && ch<= 'z') {
					hasLowerCase = true;
				}else if(ch>='0' && ch<='9') {
					hasDigit = true;
				}
				
			}
			if(!hasUpperCase) {
				error += "- Password must contain at least on uppercase letter(A-Z).\n";
			}
			if(hasLowerCase) {
				error += "- Password must contain at least on lowercase letter(a-z).\n";
			}
			if(hasDigit) {
				error += "- Password must contain at least on digit letter(0-9).\n";
			}
			
			if(error.isEmpty()) {
				System.out.println("Your pasword is  secure.");
				break;
			}else {
				System.out.println("Password validation eorror.");
				System.out.println(error);
			}
		}
 
		scan.close();
	}
 
}
 