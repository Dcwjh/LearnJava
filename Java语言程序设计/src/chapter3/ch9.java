package chapter3;
import java.util.*;

public class ch9 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer:");
		long ISBN = input.nextLong();
		System.out.println();
		long d9 = ISBN % 10;
		long d8 = ISBN / 10 %10;
		long d7 = ISBN / 100 % 10;
		long d6 = ISBN / 1000 % 10;
		long d5 = ISBN / 10000 % 10;
		long d4 = ISBN / 100000 % 10;
		long d3 = ISBN / 1000000 % 10;
		long d2 = ISBN / 10000000 % 10;
		long d1 = ISBN / 100000000;
		long d10 = (d1 *1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 *8 + d9 * 9) % 11;
		if (d10 == 10)
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
		else
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10); 
		
		
	}
	

}
