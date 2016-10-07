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
public class coprime_condndrum_1
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
		System.out.println(primes);
		if (n < 6)
			System.out.println("0");
		else
		{
			int ans = 0;
			for (int i = 0; i < primes.size() - 1; i++)
			{
				for (int j = i + 1; j < primes.size(); j++)
				{
					int p1 = primes.get(i);
					int p2 = primes.get(j);
					if (p1 * p2 <= n)
						ans++;
				}
			}
			for (int i = 0; i < primes.size(); i++)
			{
				int p1 = primes.get(i);
				if (n % p1 == 0)
				{
					int now = n / p1;
					if (primes_key.get(now) == null)
					{
						ans++;
					}
				}
			}
			System.out.println(ans);
		}

	}

}
