package beer_night;

import java.util.Scanner;

public class Currency_Arbitrage
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int ii=0;ii<n;ii++)
		{
			 double a = s.nextDouble();
			 double b = s.nextDouble();
			 double c = s.nextDouble();
			 
			double now = (double)(100000/a);
			System.out.println(now);
			
			now = (double)(now/b);
			System.out.println(now);
			
			now = (double)(now/c);
			System.out.println(now);
			
			if(now>100000)
				System.out.println((int)(now-100000));
			else
				System.out.println("0");
			 
			 
//			 System.out.println(d);
			 
			 
		}
		
		
	}

}
