package chapter4;

public class ch6 {
	private static double m;
	private static double n;
	private static double q;
	private static final double R = 40;

	public static void main(String[] args) {
		m = (double)(Math.random()*Math.PI);
		n = (double)(Math.random()*Math.PI);
		q = (double)(Math.random()*Math.PI);
		
		double x1 = R * Math.cos(Math.toDegrees(m));
		double y1 = R * Math.sin(Math.toDegrees(m));
		double x2 = R * Math.cos(Math.toDegrees(n));
		double y2 = R * Math.sin(Math.toDegrees(n));
		double x3 = R * Math.cos(Math.toDegrees(q));
		double y3 = R * Math.sin(Math.toDegrees(q));
		
		double a = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		double b = Math.sqrt((x3 - x1)*(x3 - x1) + (y3 - y1)*(y3 - y1));
		double c = Math.sqrt((x3 - x2)*(x3 - x2) + (y3 - y2)*(y3 - y2));
		
		double degree1 = 180 - Math.toDegrees(Math.acos((c*c + b*b - a*a)/(-2*b*c)));
		double degree2 = 180 - Math.toDegrees(Math.acos((c*c + a*a - b*b)/(-2*a*c)));
		double degree3 = 180 - Math.toDegrees(Math.acos((a*a + b*b - c*c)/(-2*b*a)));

		System.out.println("The three angle of this triangle is: " + degree1 + ","
				+ degree2 + "," + degree3);
		
	}
}
