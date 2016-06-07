package beer_night;

import java.util.Scanner;

import hack.replcae;

public class Gcd
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int den = s.nextInt();
		System.out.println(gcd_Cal(num, den));
		System.out.println(num/gcd_Cal(num, den)+"/"+den/gcd_Cal(num, den));
	}
	
	public static int gcd_Cal(int a,int b)
	{
		if(b==0)
			return a;
		else
			return gcd_Cal(b, a%b);
		
	}

}
