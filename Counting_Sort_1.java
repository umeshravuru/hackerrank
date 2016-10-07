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
public class Counting_Sort_1
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
			if (freq.get(i) == null)
				System.out.print("0"+" ");
			else
				System.out.print(freq.get(i) + " ");
		}

	}

}
