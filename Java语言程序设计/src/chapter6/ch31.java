package chapter6;

import java.util.Scanner;

public class ch31 {
	private static Scanner input;

	public static void main(String[] args) {
		System.out.println("Enter a credit card number as a long integer:");
		input = new Scanner(System.in);
		long number = input.nextLong();
		if(isValid(number))
			System.out.println(number + " is valid.");
		else
			System.out.println(number + " is invalid.");
	}

	public static boolean isValid(long number) {
		int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
		if(sum % 10 == 0)
			return true;
		else
			return false;

	}

	public static int sumOfDoubleEvenPlace(long number) {
		String s = String.valueOf(number);
		int d = getSize(number);
		int sum = 0;
		for(int i = 0; i < (d+1)/2; i++)
		{
			int a = (int)(s.charAt(2*i) - 48) *2;
			if(a >= 10)
			{
			    a = (a%10) + (a/10);
			}
			sum += a;
		}
		return sum;
		
	}

	public static int getDigit(int number) {
		int a = number * 2;
		if(a >= 10)
		{
		    a = (a%10) + (a/10);
		}	
		return a;
	}

	public static int sumOfOddPlace(long number) {
		int d = getSize(number);
		String s = String.valueOf(number);
		int sum = 0; 
		for(int i = 0; i < d / 2; i++)
		{
			sum += (int)(s.charAt(2*i + 1) - 48);
		}
		return sum;
	}

	public static boolean prefixMatched(long number, int d) {
		String s = String.valueOf(number);
		if(d == (int)s.charAt(0))
		{
			return true;
		}
		else return false;
	}

	public static int getSize(long d) {
		String s = String.valueOf(d);
		return s.length();
	}

	public static long getPrefix(long number,int k)
	{
		String s = String.valueOf(number);
		if((s.length()-1) < k)
			return number;
		else
		{
			String s1 = s.substring(0, k);
			return Long.parseLong(s1);
		}
	}

}
