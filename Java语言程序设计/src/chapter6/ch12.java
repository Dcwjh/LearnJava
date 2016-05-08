package chapter6;

public class ch12 {
	public static void main(String[] args) {
		printChars('1', 'z', 10);
	}
	public static void printChars(char ch1,char ch2,int numberPerline)
	{
		for(int  i = 1; i <= (int)(ch2 - ch1 + 1); i ++)
		{
			System.out.print((char)(ch1 + i - 1) + " ");
			if(i % numberPerline == 0)
				System.out.println();
		}
	}

}
