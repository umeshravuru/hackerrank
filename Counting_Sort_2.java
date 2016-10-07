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
public class Counting_Sort_2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Map<Integer, Integer> freq = new HashMap<>();
		for (int i = 0; i < n; i++)
		{
			int now = s.nextInt();
			if (freq.get(now) == null)
				freq.put(now, 1);
			else
				freq.put(now, freq.get(now) + 1);
		}
		for (int i = 0; i < 100; i++)
		{
			if (freq.get(i) != null)
			{
				for (int j = 0; j < freq.get(i); j++)
				{
					System.out.print(i + " ");
				}
			}
		}

	}

}
