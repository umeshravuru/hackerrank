/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Minimum_Amount
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int data[] = new int[n];
		for (int i = 0; i < data.length; i++)
		{
			data[i] = s.nextInt();
		}

		System.out.println(sol(data));

	}
	public static int sol(int[] data)
	{
		int ans = data[0];
		int min = data[0];
		for (int i = 1; i < data.length; i++)
		{
			min = Math.min(min, data[i]);
			if (min < data[i])
				ans = ans + data[i]-min;
		}
		return ans;
	}

}
