import javax.swing.*;
 
public class Lab104 {
 
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to the payroll application",
				"Message",JOptionPane.INFORMATION_MESSAGE);
		String name = JOptionPane.showInputDialog(null,"Enter employee name",
				"Input",JOptionPane.QUESTION_MESSAGE);
		String hourforEmployee = JOptionPane.showInputDialog(null,"Enter total hours for this employee.",
				"Input",JOptionPane.QUESTION_MESSAGE);
		
		double hourWorked = Double.parseDouble(hourforEmployee);
		double wag = 7.5;
		double grossEarning = hourWorked*wag;
		double taxRate=0.15;
		double tax=grossEarning*taxRate;
		double netEarning = grossEarning-tax;
		
		String output = ("Employee name: "+name+"\nHour worked: "+hourWorked+
				"\nHourly wage: $ "+wag+"\nGross earnings: $ "+grossEarning+
				"\nTax rate: "+taxRate+"\nTax: $ "+tax+"\nNet earnings: $ "+netEarning);
		JOptionPane.showMessageDialog(null,output, "Message",JOptionPane.INFORMATION_MESSAGE);
 
	}
 
}