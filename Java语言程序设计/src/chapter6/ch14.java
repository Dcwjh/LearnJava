package chapter6;

public class ch14 {
	 public static void main(String[] args) {
		 System.out.println("i" + "                  m(i)");
		 System.out.println("________________________________");
		 for(int i = 1; i <= 901; i = 100 + i)
		 {
			 System.out.printf("%-3d                %5.4f",i,m(i));
			 System.out.println();
		 }
		 
		 
		 
	}
	 public static double m(int n)
	 {
		 double a = 0;
		 double num = 0;
		 for(int i = 1; i <= n; i ++)
		 {
			 num += Math.pow(-1, i + 1) / (2*i - 1);
		 }
		 a = 4 * num;
		 return a;
	 }
	 
}
