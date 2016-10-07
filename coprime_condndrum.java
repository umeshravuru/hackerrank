/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**

 */
public class coprime_condndrum
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<Integer> primes = new ArrayList<>();
		primes.add(2);
		primes.add(3);
		Map<Integer, Integer> primes_key = new HashMap<>();
		for (int i = 5; i <= n; i++)
		{
			int che = 0;
			for (int j = 0; j < primes.size(); j++)
			{
				if (i % primes.get(j) == 0)
				{
					che = 1;
					break;
				}
			}
			if (che == 0)
			{
				primes_key.put(i, 1);
				primes.add(i);
			}
		}
		if (n < 6)
			System.out.println("0");
		else
		{
			int ans = 0;
			for (int i = 6; i <= n; i++)
			{
				if (primes_key.get(i) == null)
				{
					int now = i;
					for (int j = 2; j <= now / 2; j++)
					{
						if (now % j == 0)
						{
							if (j < now / j)
							{
								if (gcd_Cal(j, now / j) == 1)
									ans++;
							}
						}
					}

				}

			}
			System.out.println(ans);
		}

//		System.out.println(primes);

	}
	public static int gcd_Cal(int a, int b)
	{
		if (b == 0)
			return a;
		else
			return gcd_Cal(b, a % b);

	}

}
