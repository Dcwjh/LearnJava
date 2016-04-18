package chapter3;
import java.util.*;

public class ch15 {
	private static Scanner input;

	public static void main(String[] args) {
		int lottery = (int)(Math.random()*1000);
		input = new Scanner(System.in);
		
		int lotteryDigit1 = lottery % 10;
		int lotteryDigit2 = lottery / 10 % 10;
		int lotteryDigit3 = lottery / 100;
		//System.out.println("lottery number : " + lotteryDigit3 + lotteryDigit2 + lotteryDigit1);
		
		System.out.print("Enter your lottery pick (three digits): ");
		int guess = input.nextInt();
		int guessDigit1 = guess % 10;
		int guessDigit2 = guess / 10 % 10;
		int guessDigit3 = guess / 100;
		System.out.println("The lottery number is " + lottery);
		//System.out.println("guess number : " + guessDigit3 + guessDigit2 + guessDigit1);
		
		if(guess == lottery)
			System.out.println("exact match: you win $10000");
		else if((guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2)
			 || (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1)
			 || (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3))
			System.out.println("Match all digit: you win $3000");
		else if(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3
			 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
			 || guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)
			System.out.println("Match one digit:you win $1000");
		else
			System.out.println("Sorry, no match.");
		
	}

}
