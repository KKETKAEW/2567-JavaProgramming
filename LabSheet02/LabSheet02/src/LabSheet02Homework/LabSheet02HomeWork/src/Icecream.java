import javax.swing.*;
 
public class Icecream {
    public static void main(String[] args) {
        final int VANILLA = 10;
        final int CHOCOLATE = 15;
        final int TOPPING = 5;
        int price = 0;
        boolean pick = false;
 
        while (!pick) {
            String pickChoice = JOptionPane.showInputDialog(null,"[1] Vanilla Flavor 10 B.\n[2] Chocolate Flavor 15 B."+
            	"\nPress number to choose flavor:","Input",JOptionPane.QUESTION_MESSAGE);
 
            switch (pickChoice)
            {
                case "1":
                    price = VANILLA;
                    pick = true;
                    break;
                case "2":
                    price = CHOCOLATE;
                    pick = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"ERROR: Wrong choice!\nTry again.","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
 
        int toppingChoice = JOptionPane.showConfirmDialog(null,"Do you want to add topping?","Topping",
            JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
 
        boolean topping = (toppingChoice == JOptionPane.YES_OPTION);
 
        int totalPrice = price + (topping ? TOPPING : 0);
 
        String selectChoice = (price == VANILLA) ? "Vanilla" : "Chocolate";
        String toppingMessage = topping ? "with" : "no";
 
        JOptionPane.showMessageDialog(null,"You choose " + selectChoice + " flavor\n" + "And " + toppingMessage + " topping"+
        "\nTotal price = " + totalPrice + " baht.", "Order Summary",JOptionPane.INFORMATION_MESSAGE);
    }
}
