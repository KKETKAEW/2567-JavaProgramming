import java.util.*;
public class Lab202 {
   public static void main(String[] args)
   {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Input number : ");
       int numberBefore = scanner.nextInt();
       
       while (true) 
       {  	   
           System.out.print("Input number : ");
           int number = scanner.nextInt();
           	if (number < numberBefore) 
           	{
               break;
           	}
           numberBefore = number; 
       }
       System.out.println();
       System.out.println("BYE BYE");
       
       scanner.close();
   }
}