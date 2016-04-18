package chapter3;
import java.util.*;


public class ch1 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int n = 1;
		while(n != 0)
		{
			System.out.print("Enter a, b, c:");
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();
			double r = b * b - 4 * a * c;
			double x = Math.pow(r, 0.5);
			if(r < 0)
				System.out.println("The equation has no real roots");
			else if(r == 0)
				System.out.println("The equation has one root : " + (-b) / (2 * a));
			else
				System.out.println("The equation has two roots:" + (-b + x) / (2 * a) + " and "
						+ (-b - x) / (2 * a));
			System.out.println("If you want to stop it, please press 0.");
			n = input.nextInt();
			
		}
		
		
		
	}

}
