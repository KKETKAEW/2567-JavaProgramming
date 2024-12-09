import java.util.*;

public class Lab202 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input number : ");
	    int number = input.nextInt();
		
		while (true) 
	       {  	   
	           System.out.print("Input number : ");
	           int numberAfter = input.nextInt();
	           
	           if (numberAfter < number) 
	           {
	              break;
	           }
	           number = numberAfter; 
	       }
		
	       System.out.println();
	       System.out.println("BYE BYE");
	       
	       input.close();
		
	}

}
