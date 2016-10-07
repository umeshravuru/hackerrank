/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**

 */
public class Sum_of_two_numbers_in_array
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int data[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			data[i] = s.nextInt();
		}
		long k = s.nextLong();
		System.out.println(sol(data, k));

	}

	public static int sol(int data[], long k)
	{
		int ans = 0;
		Map<Long, Integer> freq = new HashMap<>();
		for (int i = 0; i < data.length; i++)
		{
			if (freq.get((long) data[i]) == null)
				freq.put((long) data[i], 1);
			else
				freq.put((long) data[i], freq.get((long) data[i]) + 1);

		}
		Map<Long, Integer> used = new HashMap<>();
		for (int i = 0; i < data.length; i++)
		{
			if (used.get((long) data[i]) == null)
			{
				long now = (k - (long) data[i]);
				if (now == (long) data[i])
				{
					if(freq.get(now)>1)
					{
						ans++;
						used.put((long)data[i], 1);
					}
				} else
				{
					if (freq.get(now) != null)
					{
						ans++;
						used.put((long) data[i], 1);
						used.put(now, 1);
					}
				}
			}
		}

		return ans;
	}

}
