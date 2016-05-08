package chapter6;

import java.util.*;

public class ch7 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("The amount invested:");
		double investmentAmount = input.nextDouble();
		System.out.print("Annual interset rate:");
		double yearlyInterestRate = input.nextDouble();
		double monthlyInterestRate = yearlyInterestRate / 12 / 100;
		System.out.println("years  " + "    Future Value");
		for(int i = 1; i < 31; i++)
		{
			System.out.printf("%-3d        %-15f",i,futureInvestmentVaule(investmentAmount, monthlyInterestRate, i));
			System.out.println();
		}
		
		
	}
	public static double futureInvestmentVaule(double investmentAmount,double monthlyInterestRate,int year)
	{
		return investmentAmount * Math.pow( (1 + monthlyInterestRate),(year * 12));
	}

}
