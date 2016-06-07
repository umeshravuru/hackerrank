package hack;

import java.util.Scanner;

public class Volleyball_match
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		int max = Math.max(a, b);
		int min = Math.min(a, b);
		int che = 0;
		if (max < 25)
		{
			System.out.println("0");
			che = 1;
		} else if (min > 23 && max - min != 2)
		{
			System.out.println("0");
			che = 1;
		} else if (min < 24 && max > 25)
		{
			System.out.println("0");
			che = 1;
		}

		if (che == 0)
		{
			if (max == 25)
			{
				System.out.println(mod(nCr(max + min - 1, min)));
			} else if (max > 25)
			{
				long tem = 603457371;
				long ans = NoPowMod(2, min-24, 1000000007);
				System.out.println(mod(tem*ans));
//				for (int i = 0; i < min - 24; i++)
//				{
//					ans = mod(ans * 2);
//				}
//				System.out.println(mod(ans));
			}
		}
	}

	public static long nCr(int n, int r)
	{
		if (n == r || r == 0)
			return 1;
		return nCr(n - 1, r - 1) + nCr(n - 1, r);
	}

	public static long mod(long data)
	{
		return data % 1000000007;
	}

	public static int NoPowMod(int x, int y, int z)
	{
		int a = x % z;
		int t = 1;
		while (y > 0)
		{
			// Y is odd
			if (y % 2 == 1)
			{
				t = (t * a) % z;
			}
			y >>= 1;
			a = (a * a) % z;
		}
		return t;
	}

}
