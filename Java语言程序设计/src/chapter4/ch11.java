package chapter4;
import java.util.*;

public class ch11 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Enter a number(0-15):");
		int number = input.nextInt();
		System.out.println();
		String a = " ";
		if(number < 0 || number >= 15)
			System.out.println(number + " is an invalue input");
		if(number < 10 && number >= 0)
		{
			System.out.println("The hex value is:" + number);
		}
		else 
		{
			switch(number)
			{
		     	 case 10:
			    	a = "A";
			    	System.out.println("The hex value is " + a);
				    break;
		     	 case 11:
		     		 a = "B";
		     		 System.out.println("The hex value is " + a);
		     		 break;
		     	 case 12:
		     		 a = "C";
		     		 System.out.println("The hex value is " + a);
		     		 break;
		     	 case 13:
		     		 a = "D";
		     		 System.out.println("The hex value is " + a);
		     		 break;
		     	 case 14:
		     		 a = "E";
		     		 System.out.println("The hex value is " + a);
		     		 break;
		     	 case 15:
		     		 a = "F";
		     		 System.out.println("The hex value is " + a);
		     		 break;
			}
				System.out.println("The hex value is " + a);
		}
	}
}

