package chapter5;

import java.util.Scanner;

public class ch34 {
    private static Scanner input;
    public static void main(String[] args) {
    	
        input = new Scanner(System.in);
        int c = 0;     //电脑赢得局数
        int y = 0;     //你赢的局数
        String[] b = new String[]{"scissor","rock","paper"};
        while(c < 2 && y < 2 ){
        	System.out.print("scissor(0),rock(1),paper(2):");
        	int compu = (int)(Math.random()*3);
        	int you = input.nextInt();
            if((you - compu) == -1 || (you - compu) == 2)
            {
            	y ++;
            	System.out.println("you win!");
            }
            else if((you - compu) == 0)
            {
            	y -= 0;
            	System.out.println("ping");
            }
            else
            {
            	y = 0;
            	System.out.println("you lose");
            }
         
            if((compu - you) == -1 || (compu - you) == 2)
            	c ++;
            else if((compu - you) == 0)
            	c -= 0;
            else
            	c = 0;
            System.out.println("The computer is " + b[compu] + "." + "You are " + b[you] + ".");
            System.out.println();
            
        }
        System.out.println();
        if(c >= 2)
        	System.out.println("The final result is:You lose!");
        if(y >= 2)
        	System.err.println("The final result is:You win!");
       
    }
}


