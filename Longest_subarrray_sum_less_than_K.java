/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Longest_subarrray_sum_less_than_K
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
		int k = s.nextInt();
		System.out.println(sol(data, k));

	}
	public static int sol(int a[], int k)
	{
		int ans = 0;
		int r = 0;
		long now = a[0];
		if (now > k)
		{
			now = 0;
			r++;
		}
		for (int i = 1; i < a.length; i++)
		{
			now = now + a[i];
			if (now > k)
			{
				while (now > k)
				{
					now = now - a[r];
					r++;
				}
				if (i - r + 1 > ans)
				{
					ans = i - r + 1;
				}
			} else
			{
				if (i - r + 1 > ans)
				{
					ans = i - r + 1;
				}
			}
		}
		return ans;
	}

}
