package hack;

import java.util.Scanner;

public class Help_Watson_Escape
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int ii = 0; ii < t; ii++)
		{
			long n = s.nextLong();
			long m = s.nextLong();
			long ans = m;
			n = n - 1;
			m = m - 1;

			long ans1 = 1;
			ans1 = mod(m*m);
			ans1 = mod(ans1*m);
			long ans2=1;
			for (int i = 0; i < n / 3; i++)
			{
				ans2 = mod(ans2*ans1);
			}
			if (n % 3 == 1 )
			{
				ans= mod(ans*m);
			}
			
			else if (n % 3 == 2 )
			{
				ans = mod(m * ans);
				ans = mod(m * ans);
			}
				ans = mod(ans*ans2);
			System.out.println(ans);
		}

	}

	public static long mod(long data)
	{
		return (long) (data % (Math.pow(10, 9) + 7));
	}

}