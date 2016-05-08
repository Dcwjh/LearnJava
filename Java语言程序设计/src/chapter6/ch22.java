package chapter6;

import java.util.Scanner;

public class ch22 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Enter a number:");
		long number = input.nextLong();
		if(number < 0)
			System.out.println("cannot compute the square root of a negative number!");
		else
			System.out.println(number + " ��ƽ��������ֵΪ��" + sqrt(number));
	}

	public static double sqrt(long n)
	{
		double nextGuess = 0;
		double lastGuess = 1;
		do
		{
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}while((lastGuess - nextGuess) > 0.0001);
		return lastGuess;
	}

}
