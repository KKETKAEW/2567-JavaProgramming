import java.util.*;

public class SalespersonSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// Declare constants
		final double BASE_SALARY = 1000.0;
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1; // Terminating value for input
		
		// Declare variables
		int sales; // Input gross sales
		double salary; // Salary to be computed
		
		while(true) {
			System.out.print("Enter gross sales for the salesperson(or -1 to end): ");
			sales = input.nextInt();
			
			//Check for sentnel valus
			if (sales == SENTINEL) {
				break;
			}
			//Compute Salary
			salary = BASE_SALARY + (sales * COMMISSION_RATE);
			
			//Display the salary		
			System.out.printf("The saleoerson's salary is : %,.2f%n%n",salary);
			
		} //End while
		
		System.out.println("bye");
		
		input.close();

	}

}
