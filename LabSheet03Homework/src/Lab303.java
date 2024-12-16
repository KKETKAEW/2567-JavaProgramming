import java.util.*;
public class Lab303 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String sentence=input.nextLine();
		while(!sentence.endsWith("."))
		{
			System.out.print("Input a sentence, agian : ");
			sentence=input.nextLine();
		}
		int spacebar=0;
		for(int i=0;i<sentence.length();i++)
		{
			if(sentence.charAt(i)==' ')
			{
				spacebar++;
			}
		}
		System.out.println();
		System.out.print("This sentence has "+spacebar+" spacebar."+"\nThis sentence has "+(spacebar+1)+" word.");
		
		input.close();
	}

}
