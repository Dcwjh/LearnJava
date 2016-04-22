package chapter5;

import java.util.Scanner;

public class ch17 {
 
    private static Scanner scanner;

	public static void main(String[] args) 
	{
        System.out.print("请输入一个1~15之间的整数：");
        scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println();
        int[][] array = new int[n][2*n+1]; 
        for (int i = 0; i < n; i++) 
        {
            for (int j = n-i; j <= n + i; j++)
            {
                array[i][j]=Math.abs(n-j)+1;
            }
        }
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < 2*n + 1; j++)
           	{
            		System.out.print(array[i][j]==0?"  ":array[i][j]+" ");
            	

           	}
        	System.out.println();
        }
	}
}


	


