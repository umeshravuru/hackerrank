package beer_night;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Veronica_Mars_and_the_Binary_Search_Tree_2
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int[] data = new int[t];
		for (int i = 0; i < t; i++)
		{
			data[i] = s.nextInt();
		}

		Map<Integer, Integer> left = new HashMap<Integer, Integer>();
		Map<Integer, Integer> right = new HashMap<Integer, Integer>();

		left.put(data[0], 0);
		right.put(data[0], 0);
		long final_Ans = 1;
		System.out.print(final_Ans + " ");
		for (int i = 1; i < t; i++)
		{
			final_Ans = 1;
			int now = data[0];
			while (true)
			{
				if (data[i] < now)
				{
					if (left.get(now) != null)
					{
						if (left.get(now) == 0)
						{
							left.put(data[i], 0);
							left.put(now, data[i]);
							final_Ans = mod(final_Ans * 2);
							break;
						} else
						{
							now = left.get(now);
							final_Ans = mod(final_Ans * 2);
						}
					} else
					{
						left.put(data[i], 0);
						left.put(now, data[i]);
						final_Ans = mod( 2 * final_Ans);
						break;
					}
				} else
				{
					if (right.get(now) != null)
					{
						if (right.get(now) == 0)
						{
							right.put(data[i], 0);
							right.put(now, data[i]);
							final_Ans = mod(2 * final_Ans + 1);
							break;
						} else
						{
							now = right.get(now);
							final_Ans = mod(final_Ans * 2 + 1);
						}
					} else
					{
						right.put(data[i], 0);
						right.put(now, data[i]);
						final_Ans = mod(final_Ans * 2 + 1);
						break;
					}
				}

				// System.err.println("left :"+ left);
				// System.err.println("right :"+right);

			}

			System.out.print(mod(final_Ans) + " ");
//			System.out.println(left);
//			System.out.println(right);
		}
//		System.out.println();
//		System.out.println(left);
//		System.out.println(right);

	}
	public static long mod(long data)
	{
		return data%(1000000007);
	}

}
