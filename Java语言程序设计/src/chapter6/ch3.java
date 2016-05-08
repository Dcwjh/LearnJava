package chapter6;

import java.util.Scanner;

public class ch3 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = input.nextInt();
		if(isPalindrome(num))
			System.out.println(num + " is a palindrome");
		else
			{
				System.out.println(num + " is not a palindrome");
				System.out.println(num + "的回文数为:" + reverse(num));
			}
		
	}
		
		public static int reverse(int number)
		{
			String s = String.valueOf(number);
			char[] ch = s.toCharArray();
			int low = 0;
			int high = s.length() - 1;
			if(isPalindrome(number))
				return number;
			else
				{
					while(low < high)
					{
						char temp = ch[low];
						ch[low] = ch[high];
						ch[high] = temp;
						low ++;
						high --;
					}
					String s1 = String.copyValueOf(ch);
					int newnumber = Integer.parseInt(s1);
					return newnumber;
				}
		}
		public static boolean isPalindrome(int number)
		{
			String s = String.valueOf(number);
			int low = 0;
			int high = s.length() - 1;
			boolean ispd = true;
			while(low < high)
			{
				if(s.charAt(low) != s.charAt(high))
				{
					ispd = false;
					return ispd;
				}
				low ++;
				high --;
			}
			return ispd;
		}
		
		
	

}
