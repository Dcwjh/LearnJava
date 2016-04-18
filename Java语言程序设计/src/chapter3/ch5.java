package chapter3;
import java.util.*;

public class ch5 { 
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Enter today's day :");
		int today = input.nextInt();
		System.out.println();
		String a = " " ;
		
		System.out.print("Enter the number of days elapsed since today: ");
		int number = input.nextInt();
		int newday = (today + number) % 7;
		switch(today)
		{
			case 0:
				a = "Sunday";
				break;
			case 1:
				a = "Monday";
				break;
			case 2:
				a = "Thuesday";
				break;
			case 3: 
				a = "Wednesday";
				break;
			case 4:
				a = "Thursday";
				break;
			case 5:
				a = "Friday";
				break;
			case 6:
				a = "Saturday";
				break;
			default :
				System.out.println("Enter error.");
		}
		String b = " ";
		switch(newday)
		{
			case 0:
				b = "Sunday";
				break;
			case 1:
				b = "Monday";
				break;
			case 2:
				b = "Thuesday";
				break;
			case 3: 
				b = "Wednesday";
				break;
			case 4:
				b = "Thursday";
				break;
			case 5:
				b = "Friday";
				break;
			case 6:
				b = "Saturday";
				break;
			default :
				System.out.println("Enter error.");
		}
		System.out.println();
		System.out.println("Today is " + a + " and the future day is " + b + ".");
		
	}

}
