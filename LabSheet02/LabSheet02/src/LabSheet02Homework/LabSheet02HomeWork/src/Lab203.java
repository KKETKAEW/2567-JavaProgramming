import javax.swing.*;
import java.text.*;
 
public class Lab203 {
 
	public static void main(String[] args) {
		String weightInput = JOptionPane.showInputDialog(null,"Input Weight:",
				"Input",JOptionPane.QUESTION_MESSAGE);
		double  weight = Double.parseDouble(weightInput);
		String heightInput = JOptionPane.showInputDialog(null,"Input Height:",
				"Input",JOptionPane.QUESTION_MESSAGE);
		double height = Double.parseDouble(heightInput);
		double heightM = height/100;
		Double BMI = weight/(heightM*heightM);
		String result ;
		if(BMI<=18.5)
		{
			result = "Underweight";
		}
		else if(BMI>=18.5 && BMI<=24.9)
		{
			result ="Normal-weight";
		}
		else if(BMI>=25.0 && BMI<=29.9)
		{
			result ="Over-weight";
		}
		else
		{
			result ="Obesity";
		}
		DecimalFormat df = new DecimalFormat("00.#");
		JOptionPane.showMessageDialog(null, "BMI = "+df.format(BMI)+
				"\nYou're "+result,"BMI",JOptionPane.WARNING_MESSAGE);
 
	}
 
}
