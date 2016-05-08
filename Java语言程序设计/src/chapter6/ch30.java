package chapter6;

public class ch30 {	
	public static void main(String[] args) {

			int a = (int)(1 + Math.random()*6);
			int b = (int)(1 + Math.random()*6);
			int n = a + b;
			System.out.println("You rolled " + a + " + " + b + " = " + n);
			switch(n)
			{
			    case 2:
			    case 3:
			    case 12:
			    	System.out.println("You lose");
			    	break;
			    case 7:
			    case 11:
			    	System.out.println("You win");
			    	break;
			    case 4:
			    case 5:
			    case 6:
			    case 8:
			    case 9:
			    case 10:
			    {
			    	System.out.println("point is " + n);
			    	while(true)
			    	{
			    		a = (int)(1 + Math.random()*6);
			    		b = (int)(1 + Math.random()*6);
			    		int c = a + b;
			    		System.out.println("You rolled " + a + " + " + b + " = " + c);
			    		if(n == c)
			    		{
			    			System.out.println("You win");
			    			break;
			    		}
			    		if(c == 7)
			    		{
			    			System.out.println("You lose");
			    			break;
			    		}
		    			System.out.println("point is " + c);
			    	}
			    	break;
			    }
			}
	}
}
