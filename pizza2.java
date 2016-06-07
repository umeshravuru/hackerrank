package hack;

import java.util.Scanner;

public class pizza2
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int c = r-s.nextInt();
		double ans = (double)(100*c*c)/(r*r);
		System.out.println((double)Math.round(ans * 10000000d) / 10000000d);
		
		
	}

}
