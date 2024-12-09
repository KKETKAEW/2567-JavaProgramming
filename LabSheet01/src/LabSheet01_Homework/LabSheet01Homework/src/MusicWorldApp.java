import javax.swing.*;
 
public class MusicWorldApp {
 
	public static void main(String[] args) {
		String cdId = JOptionPane.showInputDialog(null, "This program calculates the total cost of a CD order"+
				"\nPlease enter the ID of the CD", "Input", JOptionPane.QUESTION_MESSAGE);
	    String cdTitle = JOptionPane.showInputDialog(null, "Please enter the title of the CD", "Input", JOptionPane.QUESTION_MESSAGE);
	    String cdPriceString = JOptionPane.showInputDialog(null, "Please enter the price of the CD in U.S. dollars", "Input", JOptionPane.QUESTION_MESSAGE);
	    double cdPrice = Double.parseDouble(cdPriceString);
	    String cdQuantityString = JOptionPane.showInputDialog(null, "Please enter the quantity to be purchased", "Input", JOptionPane.QUESTION_MESSAGE);
	    int cdQuantity = Integer.parseInt(cdQuantityString);
	    
	    double cdSubtotal = cdPrice * cdQuantity;
	    double TAX_RATE = 6.25/100;
	    double taxRate = TAX_RATE*100;
	    double tax = cdSubtotal * TAX_RATE;
	    double cdTotal = cdSubtotal * (1+TAX_RATE);
	    
	    String output = "Summary of the transaction:\n\nCD ID:"+cdId+"\nCD Title:"+cdTitle+
	    		"\nCD Unit Price:$"+cdPrice+"\nCD Quantity:"+cdQuantity+"\n\nSubtotal:$"+cdSubtotal+
	    		"\nTax rate:"+taxRate+"%"+"\nTotal:$"+cdTotal+"\n\nEnd of Program";
	   JOptionPane.showMessageDialog(null, output, "Message", JOptionPane.INFORMATION_MESSAGE);
 
	}
 
}
