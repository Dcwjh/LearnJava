package chapter4;
import java.util.Scanner;

public class ch11second {
    private static Scanner input;
    public static void main(String[] args) {
		input = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a number(0-15):");
			String str = input.nextLine();
			String result = getResult(str);
			System.out.println(result);	
		}
	}

	private static String getResult(String str) {
		int a = Integer.parseInt(str);
		if (a <= 15 && a >= 0) {
			return "The hex value is " + Integer.toHexString(a).toUpperCase();// ��ת��16����,Ȼ���ɴ�д
		}
		return a + " is an invalue input";
	}
}


