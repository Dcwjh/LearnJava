package chapter6;

import java.util.Scanner;

public class ch18 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Enter your password" + "(including words and numbers):");
		String password = input.nextLine();
		testPassword(password);
	}

	public static int numbersOfcount(String s1) {
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (Character.isDigit(s1.charAt(i)))
				count++;
		}
		return count;
	}

	public static boolean testword(String s2) {
		boolean b = false;
		for (int i = 0; i < s2.length(); i++) {
			if (Character.isDigit(s2.charAt(i)) || Character.isLetter(s2.charAt(i)))
				b = true;
			else
				b = false;
		}
		return b;
	}

	public static void testPassword(String s) {
		if (numbersOfcount(s) >= 2 && s.length() >= 8 && testword(s))
			System.out.println("Valid Password!");
		else
			System.out.println("Invalid Password!");
	}

}
