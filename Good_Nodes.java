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
public class Good_Nodes
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
		System.out.println(sol(data));

	}
	public static int sol(int[] data)
	{
		int ans = 0;
		for (int i = 0; i < data.length; i++)
		{
			if (data[i] == 1)
			{
				ans = 1;
				break;
			}
		}
		int now[] = new int[data.length];
		for (int i = 0; i < data.length; i++)
		{
			now[i] = i + 1;
		}
		while (true)
		{

			for (int i = 0; i < data.length; i++)
			{
				int use = data[i];
				for (int j = 0; j < data.length; j++)
				{
					if (data[j] == use)
						data[j] = now[i];
				}
				disp(data);
			}

			int che = 0;
			for (int i = 1; i < data.length; i++)
			{
				if (data[0] != data[i])
				{
					che = 1;
					break;
				}
			}
			if (che == 0)
			{
				if (data[0] == 1)
					return 0;
				else
					return 1;
			} else
			{
				Map<Integer, Integer> freq = new HashMap<>();
				for (int i = 0; i < now.length; i++)
				{
					if (freq.get(data[i]) == null)
						freq.put(data[i], 1);
					else
						freq.put(data[i], freq.get(data[i]) + 1);
				}
				System.out.println(data);
				if (ans == 1)
				{
					return freq.size();
				} else
					return freq.size() - 1;
			}

		}
	}
	public static void disp(int data[])
	{
		for (int i = 0; i < data.length; i++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
}
