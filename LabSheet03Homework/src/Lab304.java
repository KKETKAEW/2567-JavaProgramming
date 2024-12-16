import java.util.*;
public class Lab304 {

	public static void main(String[] args) {
		Scanner fn = new Scanner(System.in);
		System.out.print("Full name: ");
		String fullName =fn.nextLine();
		int partOfname = fullName.indexOf(" ");
		if(partOfname!=-1)
		{
			String firstName = fullName.substring(0,partOfname);
            String lastName = fullName.substring(partOfname + 1);
            
            System.out.println("First Name: " + firstName.toUpperCase());
            System.out.println("Last Name: " + lastName.toLowerCase());
		}
		else
		{
			System.out.println("Incorrect Name");
		}

		fn.close();
	}

}
