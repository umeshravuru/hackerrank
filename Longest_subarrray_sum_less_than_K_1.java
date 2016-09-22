/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Longest_subarrray_sum_less_than_K_1
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

		for (int i = 0; i < a.length-1; i++)
		{
			long sum = a[i];
			if (sum <= k)
			{
				if (ans < 1)
					ans = 1;
			}
			for (int j = i+1; j < a.length; j++)
			{
				sum = sum + a[j];
//				System.out.println(sum);
				if (sum <= k)
				{
					if (ans < j - i+1)
						ans = j - i+1;
				}
				else
					break;
			}
		}

		return ans;
	}

}
