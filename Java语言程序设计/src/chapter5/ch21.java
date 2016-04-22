package chapter5;
import java.util.*;

public class ch21 {
		private static Scanner input;
		
		public static void main(String[] args) {
			input = new Scanner(System.in);
			System.out.print("Loan Amount:");
			double money = input.nextDouble();
			
			System.out.print("Number of years:");
			int years = input.nextInt();
			
			double monthly = 0;
			double total = 0;
			double rate = 0.05;
			double rate2 = 0;
			System.out.println("Interset Rate   Monthly Payment  Total Payment");
			for(int i = 0; i < 25; i++)
			{
				rate2 = rate / 12;
				monthly = money * rate2 / (1 - 1 / Math.pow(1 + rate2, years * 12));
				total = monthly * years * 12;
				System.out.printf("%-16f%-17f%-16f",rate,monthly,total);
				System.out.println();
				rate = rate + 0.00125;
			}

		}
}
