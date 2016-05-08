package chapter6;

import java.util.Scanner;

public class ch34 {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.print("Enter a number:");
		int number = in.nextInt();
		System.out.print("Enter the digit of number:");
		int digit = in.nextInt();
		System.out.println("Format number is: " + format(number, digit));
		
		
	}
	public static String format(int number,int width)
	{
		String s = String.valueOf(number);
		int count = 0;
		while(number > 0)
		{
			number = number / 10;
			count ++;
		}
		if(width <= count)
			return s;
		else
		{
			String a = "0";
			for(int i = 1; i < width - count;i ++)
				a += "0";
			s = a + s;
			return s;
				
		}
	}

}
