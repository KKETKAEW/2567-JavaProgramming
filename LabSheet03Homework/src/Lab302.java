import javax.swing.*;
public class Lab302 {
	public static void main(String[] args) {
		String inputEmail = JOptionPane.showInputDialog("Input yor e-mail:");
		
		while(inputEmail.startsWith("@")||inputEmail.contains(" "))
		{
			if(inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com"))
			{
				JOptionPane.showMessageDialog(null, "Your email is hotmail or email dot com");
				continue;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Your e-mail is "+inputEmail);
				break;
			}
		}
	}
}