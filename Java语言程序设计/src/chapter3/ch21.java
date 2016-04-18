package chapter3;
import java.util.*;

public class ch21 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Enter year:(e.g.,2012):");
		int year = input.nextInt();
		System.out.println();

		System.out.print("Enter month: 1-12:");
		int m = input.nextInt();
		System.out.println();
		if(m == 1)
		{
			m = 13;
			year -= 1;
		}
		else if(m == 2)
		{
			m = 14;
			year -= 1;
		}
			
		int j = year / 100;
		int k = year % 100;
		
		System.out.print("Enter the day of the month: 1-31:");
		int q = input.nextInt();
		System.out.println();
		
		int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		String a = " ";
		switch(h)
		{
		   case 0:
			   a = "Saturday";
			   break;
		   case 1 :
			   a = "Sunday";
			   break;
		   case 2:
			   a = "Monday";
			   break;
		   case 3:
			   a = "Thuesday";
			   break;
		   case 4:
			   a = "Wednesday";
			   break;
		   case 5:
			   a = "Thursday";
			   break;
		   case 6:
			   a = "Friday";
			   break;
		  default:
			  System.out.println("Error.");
		}
		System.out.println("Day of the week is " + a);
	}

}
