/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Map;
import java.util.Scanner;

/**

 */
public class Non_Divisible_Subset_2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int data[] = new int[n];
		int freq[] = new int[k];
		for (int i = 0; i < n; i++)
		{
			data[i] = s.nextInt() % k;
			freq[data[i]]++;
		}
//		disp(freq);
		int ans = 0;
		if (freq[0] != 0)
			ans++;
		if (k % 2 == 0)
		{
			if (freq[k / 2] != 0)
				ans++;

//			System.out.println(ans);
			for (int i = 1; i < k / 2; i++)
			{
				ans = ans + Math.max(freq[i], freq[k - i]);
			}
		} else
		{
			for (int i = 1; i <= k / 2; i++)
			{
				ans = ans + Math.max(freq[i], freq[k - i]);
			}
		}

		System.out.println(ans);

	}

	public static void disp(int data[])
	{
		for (int i = 0; i < data.length; i++)
		{
			System.out.println(data[i]);
		}
	}

}
