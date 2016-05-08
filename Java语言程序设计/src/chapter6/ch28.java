package chapter6;

public class ch28 {
	public static void main(String[] args) {
		System.out.println("P                2^p-1");
		System.out.println("2                3");
		for(int i = 2; i <= 31 ; i ++)
		{
			if(meilin(i))
			{
				System.out.printf("%-6d           ",i);
				System.out.println(Math.pow(2, i)-1);
			}
		}
	}
	public static boolean isPrime(long number)
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
	public static boolean meilin(long number)
	{
		boolean ismeilin = false;
		if(isPrime(number))
		{
			for(int i = 1; i <= 31; i++)
			{
				if(number == Math.pow(2, i) - 1)
					{
						ismeilin = true;
						break;
					}
			}
		}
		return ismeilin;
			
	}

}
