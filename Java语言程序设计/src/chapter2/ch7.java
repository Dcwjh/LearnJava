package chapter2;
import java.util.*;

public class ch7 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Enter the number of minutes:");
		long minutes = input.nextLong();
		int hours = (int)minutes / 60;
		int days = hours / 24;
		int years = days / 365;
		days = days - years * 365;
		System.out.println(minutes + " minutes is approximately " + years  + " years "+ " and "
				+ days + " days.");
		
	}

}
