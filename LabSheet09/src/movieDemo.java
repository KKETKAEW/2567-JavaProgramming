import java.util.Scanner;
public class MovieDemo {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Input movie id: ");
       String movieId = scan.nextLine();
       System.out.print("Input movie name: ");
       String movieName = scan.nextLine();
       System.out.println();
       System.out.print("Input director name: ");
       String direcName = scan.nextLine();
       System.out.print("Input director e-mail: ");
       String direcEmail = scan.nextLine();
       char direcGender;
       
       while (true) {
           System.out.print("Input director gender: ");
           String inputGender = scan.nextLine().toLowerCase();
           
           if (inputGender.equals("m") || inputGender.equals("f")) {
               direcGender = inputGender.charAt(0);
               break;
               
           }
           System.out.println("Input director gender, again");
           
       }
       System.out.println();
       int theaters;
       
       while (true) {
           System.out.print("Input movie theater no. (1-15 only): ");
           theaters = scan.nextInt();
           
           if (theaters >= 1 && theaters <= 15) {
               break;
               
           }
           
           System.out.println("Please input 1 - 15 only!");
       }
       director director = new director(direcName, direcEmail, direcGender);
       theater theater = new theater(movieId, movieName, director, theaters);
       System.out.println(theater);
       
       
       scan.close();
   }
}