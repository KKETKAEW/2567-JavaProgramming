import java.util.*;
 
public class Lab102 {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
		int minute =scan.nextInt();
		int minuteofOneyear = 60*24*365;
		int minuteofOneday = 60*24;
		int year = minute/minuteofOneyear;
		int minuteMod = minute%minuteofOneyear;
		int day = minuteMod/minuteofOneday;
		System.out.println(minute+" minutes is approximately "+year+" years and "+day+" days");
		scan.close();
 
	}
 
}
