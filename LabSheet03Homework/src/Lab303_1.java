import javax.swing.JOptionPane;
public class Lab303_1 {

	public static void main(String[] args) {
		String sentence = JOptionPane.showInputDialog(null,"Input a sentence : ","Input",JOptionPane.QUESTION_MESSAGE);
		while(!sentence.endsWith("."))
		{
			sentence = JOptionPane.showInputDialog(null,"Input a sentence, agian : ","Input",JOptionPane.QUESTION_MESSAGE);
		}
		//int spacebar = sentence.indexOf(" ");
		int spacebar=0;
		for(int i=0;i<sentence.length();i++)
		{
			if(sentence.charAt(i)==' ')
			{
				spacebar++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "This sentence has "+spacebar+" spacebar."+"\nThis sentence has "+(spacebar+1)+" word.","Message",JOptionPane.INFORMATION_MESSAGE);
	}

}
