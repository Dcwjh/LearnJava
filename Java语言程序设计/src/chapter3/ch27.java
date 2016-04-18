package chapter3;

import java.util.*;

public class ch27 {
	private static Scanner input;

	public static void main(String[] args) {
			input = new Scanner(System.in);
			System.out.print("Enter a point's x- and y-coordinate:");
			double x3 = input.nextDouble();
			double y3 = input.nextDouble();
			System.out.println();
			
			double x1 = 200, y1 = 0;
			double x2 = 0, y2 = 100;
			
			double s1 = 50 * x3;
			double s2 = 100 * y3;
			double s3 = (1/2) * (x1*y2+x2*y3+x3*y1-x1*y3-x2*y1-x3*y2);
			double s = s1 + s2 + s3;
			
			if(s > 10000)
				System.out.println("The point is not in the triangle");
			else
				System.out.println("The point is in the triangle");
			
		}
}