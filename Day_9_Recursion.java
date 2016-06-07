package hack;

import java.util.Scanner;

import javax.naming.spi.ResolveResult;

public class Day_9_Recursion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		if(b>a)
		{
			a=a+b;
			b=a-b;
			a=a-b;
		}
		
		System.out.println(gcd(a,b));

	}
	
	public static long gcd(long a,long b)
	{
		if(b>a)
		{
			a=a+b;
			b=a-b;
			a=a-b;
		}
		
		if(a==b)
			return a;
		else
			return gcd(a-b,b);
		
	}

}
