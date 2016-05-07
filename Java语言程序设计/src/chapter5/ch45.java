package chapter5;

import java.util.*;

public class ch45 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		double[] num = new double[10];
		double sum = 0;
		double avg = 0;
		double summ = 0;
		double sm = 0;
		double p = 0;
		System.out.print("Enter ten number:");
		String numberString = input.nextLine();
		for(int i = 0; i < 10; i++)
			num[i] = Double.parseDouble(numberString.split(" ")[i]);
		for(double a : num)
		{
			sum += a;
			summ += a*a;	
		}
		avg = sum / 10;
		sm = sum * sum / 10;
		p = Math.sqrt((summ - sm)/9);
		System.out.println("The mean is: " + avg);
		System.out.println("The standard deviation is " + p);
	
		
		
			
	}

}
