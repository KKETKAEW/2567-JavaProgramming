import javax.swing.*;
public class Lab402 {
	static String yearInput;

	public static void main(String[] args) {
			yearInput = JOptionPane.showInputDialog("Input year:");
			int year = Integer.parseInt(yearInput);
			if(yearInput!=null&&!yearInput.isEmpty())//ถ้าไม่เป็นค่าว่าง
			{
				checkYear(year);
				if(isLeapYear(year))
				{
					 JOptionPane.showMessageDialog(null, year + " is Leap year.");
				}else {
					JOptionPane.showMessageDialog(null, year + " is NOT Leap year.");
				}
			}	


	}

	public static boolean isLeapYear(int year) {
		if((year%4==0&&year%100!=0)||(year%400!=0))
		{
				return true;
		}
		return false;
		
		
	}
	public static boolean checkYear(int year) {
		/*if(year>=1000&&year<=3000)
		{
			return true;
		}else {
			return false;
		}*/
		return year>=1000&&year<=3000;
		
		
	}
}
