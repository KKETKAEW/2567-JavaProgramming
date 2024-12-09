
import java.util.*;
import java.text.*;
 
public class Lab101 {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Product Name	: ");
		String nameofProduct = scan.nextLine();
		System.out.print("Input Product Unit	: ");
		int unitofProduct = scan.nextInt();
		System.out.print("Input price per unit 	: ");
		double priceofProduct = scan.nextDouble();
		System.out.println("------------------------------------------------");
		double total = priceofProduct*unitofProduct;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		System.out.println("Total Price is "+(frm.format(total))+" baht.");
		System.out.println("------------------------------------------------");
		System.out.print("How many discount (%) 	: ");
		double dicountProduct = scan.nextDouble();
		System.out.println("------------------------------------------------");
		double discount = (total*dicountProduct)/100;
		double totalPrice = total-discount;
		System.out.println("Discount from 15% 	  "+frm.format(discount)+" baht.");
		System.out.println("Amount to be paid 	  "+frm.format(totalPrice)+" baht.");
		scan.close();
	}
 
}
