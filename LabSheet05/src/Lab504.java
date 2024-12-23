import java.util.*;
public class Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] score = new double[5];
		double total=0;
		double average=0;
		
		for(int i=0;i<score.length;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			score[i] = scan.nextDouble();
			
		}
		System.out.println();
		
		for (int i = 0; i < score.length; i++) {
            total += score[i];
        }
        average = total / score.length;
		System.out.printf("Average of 5 student is %,.2f%n",average);
		
		int i=0;
		for(double _score : score) {
			if(average<_score) {
			System.out.printf("> Student %d (%.2f)%n",(i+1),_score);
			}
			i++;
		}
		
		scan.close();
	}

}
