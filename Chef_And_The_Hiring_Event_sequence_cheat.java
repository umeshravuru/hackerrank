package hack;

import java.util.Scanner;

public class Chef_And_The_Hiring_Event_sequence_cheat
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		long t = s.nextLong();
		for (long i = 0; i < t; i++)
		{
			long n = s.nextLong();
			long m = (long) Math.floor((float)Math.log(n-1)/(float)Math.log(5));
			long b_j=0;
			for(long j =0;j<=m-1;j++)
			{
				b_j = (long) (b_j + (((long)2*Math.floor((float)n-1-Math.pow(5, m)/(float)Math.pow(5, j)))%10)*Math.pow(10, j));
			}
			
			long ans = (long) (((2*(long)Math.floor((float)n-1-Math.pow(5, m)/(float)Math.pow(5, m)) % 8)+2)*Math.pow(10, m));
			ans = ans + b_j;
			
			System.out.println(ans);
			
			
			
		}

	}

}
