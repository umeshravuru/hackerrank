package hack;

import java.util.Scanner;


class Calculator extends Exception{
    
    
   // private static final Exception ExceptionInInitializerError = null;
	public int power(int a,int b) throws Exception{
       
        if(a>=0 && b>=0)
            {
        return (int)Math.pow(a,b);
        }
        else
        {
        	throw new Exception("n and p should be non-negative");
        }
       
		 
    }
	

  
    
    
    
}


public class Day_17_Exceptions_testing {
	

	public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
            	//System.out.println("uemsh");
                System.out.println(e.getMessage());
            }
        }

    }
	

}

