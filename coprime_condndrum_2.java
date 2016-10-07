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
public class coprime_condndrum_2
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
			for (int ii = 6; ii <= n; ii++)
			{
				for (int i = 2; i <= ii / 2; i++)
				{
//					if(ii%2)
				}
			}
		}

	}

}
