package chapter4;
import java.util.*;
import java.lang.Math;

public class ch2 {
	private static Scanner input;
	 public static final double R = 6371.01;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Enter point 1(latitude and longitude) in degrees: ");
		String s1=input.nextLine();
	    double x1=Double.parseDouble(s1.split(",")[0]);
	    double y1=Double.parseDouble(s1.split(",")[1]);
		
		System.out.print("Enter point 2(latitude and longitude) in degrees: ");
		String s2=input.nextLine();
		double x2=Double.parseDouble(s2.split(",")[0]);
	    double y2=Double.parseDouble(s2.split(",")[1]);
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		double d = R *(Math.acos(Math.sin(x1)* Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
		System.out.println("The distance between the two point is " + d);
		
	}

}
