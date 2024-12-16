import java.util.*;
public class Lab306 {

	public static void main(String[] args) {
		Scanner sm = new Scanner(System.in);
		System.out.print("Message : ");
		String message=sm.nextLine();
		//String word ="Nichi";
		if(message.toLowerCase().indexOf("nichi")>=0)
		{
			
			System.out.println("Nichi is a sentence");
		}
		else
		{
			System.out.println(message);
		}
		sm.close();
	}

}
