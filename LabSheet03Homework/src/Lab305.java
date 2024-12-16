import java.util.*;
public class Lab305 {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		
		while (true) 
		{
			System.out.print("Input some sentence : ");
			String sentence=ss.nextLine();
            
			while(!sentence.endsWith("."))
			{
				System.out.print("The sentence must end with full stop point : ");
				sentence=ss.nextLine();
			}
		
				System.out.println();
		
			int start = 0;
			sentence = sentence.substring(0, sentence.length() - 1);
			
			for(int i =0;i<=sentence.length();i++)
			{
				if(i == sentence.length() ||sentence.charAt(i)==' ')
				{
					System.out.println(sentence.substring(start, i));
					start = i+1;
				
				}
			
			}
				break;
		}

        
		ss.close();
	}

}
