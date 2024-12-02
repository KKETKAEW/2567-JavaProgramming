import javax.swing.*;
import java.util.*;
import java.text.*;
public class Withdrawal {

	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9)*100000;
		
		int moneyWithdraw = Integer.parseInt(JOptionPane.showInputDialog(
				"Your balance :"+balance+ 
				"\nInput money to withdraw: "));
		if(moneyWithdraw>balance) 
		{
			JOptionPane.showMessageDialog(null, "Error :Cannot withdraw more then balance",
					"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(moneyWithdraw>50000) 
		{
			JOptionPane.showMessageDialog(null, "Error :Cannot withdraw more then 50,000",
					"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(moneyWithdraw%100 !=0)
		{
			JOptionPane.showMessageDialog(null, "Error :Cannot withdraw "+(moneyWithdraw%100)+"baht.",
					"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You withdraw is"+moneyWithdraw+"baht."+
					"\n1,000 = " + (moneyWithdraw/1000)+
					"\n 500  = " + (moneyWithdraw%1000)/500+
					"\n 100  = " + (moneyWithdraw%500)/100);
					
		}

	}

}
