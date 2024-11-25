import javax.swing.*;
public class JavaExample2 {

	public static void main(String[] args) {
		String productName = JOptionPane.showInputDialog("Input Product Name:");
		String productUnitStr = JOptionPane.showInputDialog("Input product Unit:");
		int productUnit = Integer.parseInt(productUnitStr);
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Input Price per unit"));
		
		double totalPrice = productPrice * productUnit;
		double totalVat = totalPrice +(totalPrice *7/100);
		
		String frmTotalPrice =String.format("%,.2f", totalPrice);
		String frmTotalVat = String.format("%,.2f", totalVat);
		
		JOptionPane.showMessageDialog(null, "Total Price is "+frmTotalPrice+" baht."
				+"\nAdd VAT 7% is "+frmTotalVat+ " baht.");

		

	}

}
