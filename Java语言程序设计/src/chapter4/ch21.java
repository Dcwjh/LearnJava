package chapter4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ch21 {
	private static Scanner input;

	public static void main(String[] args) 
	{
		input = new Scanner(System.in);
		String eL = "[0-9]{3}-[0-9]{2}-[0-9]{4}";
		Pattern p = Pattern.compile(eL);
		System.out.print("Enter a SSN:");
		String test = input.nextLine();
		Matcher m = p.matcher(test);
		boolean dataFlag = m.matches();
		if (dataFlag)
		{
			System.out.println(test + " is a valid social security number");
		}
		else
		{
			System.out.println(test + " is an invalid social security number");
		}
	}
}
