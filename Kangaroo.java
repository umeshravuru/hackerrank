package Hackerrank;

import java.util.Scanner;

public class Kangaroo
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		
		if((a-c)*(d-b)>=0)
		{
			int gcd = gcd_Cal(c-a, b-d);
			
			if(gcd == Math.abs(b-d))
			System.out.println("YES");
			else
				System.out.println("NO");
			
		}
			
		else
			System.out.println("NO");
		
		
	}
	public static int gcd_Cal(int a,int b)
	{
		if(b==0)
			return a;
		else
			return gcd_Cal(b, a%b);
		
	}

}
