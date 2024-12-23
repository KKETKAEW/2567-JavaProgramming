import javax.swing.*;

public class Lab402 {
    public static void main(String[] args) {
        int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Input year:"));

        while (!checkYear(year)) {
            year = Integer.parseInt(JOptionPane.showInputDialog(null, "Input year, again:"));
        }

        if (isLeapYear(year)) {
            JOptionPane.showMessageDialog(null, year + " is leap year.");
        } else {
            JOptionPane.showMessageDialog(null, year + " is NOT leap year.");
        }
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        
    }

    private static boolean checkYear(int year) {
    	/*if(year>=1000&&year<=3000)
		{
			return true;
		}else {
			return false;
		}*/
        return year >= 1000 && year <= 3000;
        
    }
}