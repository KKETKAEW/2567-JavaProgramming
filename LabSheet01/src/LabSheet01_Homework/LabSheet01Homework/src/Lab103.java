import javax.swing.*;
 
public class Lab103 {
 
	public static void main(String[] args) {
		String minuteofParking = JOptionPane.showInputDialog(null,"Input Time Parking(minute):",
		"Input",JOptionPane.QUESTION_MESSAGE);
		int minutes = Integer.parseInt(minuteofParking);
		int hour = minutes/60;
		int minute = minutes%60;
		double hourTotal = 50;
		double minuteTotal=0.25;
		double price = (hour*hourTotal)+(minute*minuteTotal);
		JOptionPane.showMessageDialog(null, "You parking "+hour+" Hour "+minute+" Minute."+
		"\nAmount to be paid is "+price+" baht.","Message",JOptionPane.INFORMATION_MESSAGE);
	}
 
}
