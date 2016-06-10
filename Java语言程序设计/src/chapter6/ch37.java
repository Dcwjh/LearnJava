package chapter6;

import java.util.Scanner;

public class ch37 {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.print("Enter a number:");
		int number = in.nextInt();
		System.out.print("format size:");
		int size = in.nextInt();
		System.out.println("format number is :"  + format(number,size));
		
	}
	public static String format(int number,int width)
	{
		String s = number + "";
		if(width <= s.length())
			return s;
		else
		{
			String s1 = "";
			for(int i = 0 ; i < width - s.length(); i++)
				s1 += "0";
			s1 += s;
			return s1;
		}
			
	}

}
