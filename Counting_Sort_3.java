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
public class Counting_Sort_3
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		Map<Integer, Integer> freq = new HashMap<>();
		for (int i = 0; i < n; i++)
		{
			String data = s.nextLine();
			String data1[] = data.split(" ");
			int now = Integer.parseInt(data1[0]);
			if (freq.get(now) == null)
				freq.put(now, 1);
			else
				freq.put(now, freq.get(now) + 1);
		}
		int now = 0;
		for (int i = 0; i < 100; i++)
		{
			if (freq.get(i) != null)
				now = now + freq.get(i);
			System.out.print(now+" ");
		}

	}

}
