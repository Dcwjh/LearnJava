package chapter2;
import java.util.*;

public class ch14 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds:");
		double weight = input.nextDouble();
		System.out.println();
		
		System.out.print("Enter height in inches:");
		double height = input.nextDouble();
		System.out.println();
		
		weight *= 0.45359237;
		height *= 0.0254;
		
		double BMI = weight / (height * height);
		System.out.println("BMI is " + BMI);
		
		
	}

}
