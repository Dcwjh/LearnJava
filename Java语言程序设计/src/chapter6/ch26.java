package chapter6;

public class ch26 {
	public static void main(String[] args) {
		int count = 1;
		int number = 2;
		while(count <= 100)
		{
			if(isPalindrome(number) && isPrime(number))
			{
				if(count % 11 == 0)
					System.out.println();
				else
					System.out.printf("%-5d ",number);
				number ++;
				count ++;
			}
			else 
				number ++;
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
	public static boolean isPrime(int number)
	{
		boolean isPrime = true;
		for(int i = 2; i <= number / 2; i++)
		{
			if(number % i == 0)
			{
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
